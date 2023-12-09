package org.feedback.FeedBackApp.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.feedback.FeedBackApp.model.SubjectModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("subjectRepo")
public class SubjectRepositoryImpl implements SubjectRepository{

	@Autowired
	JdbcTemplate template;
	List<SubjectModel> list=new ArrayList<SubjectModel>();
	int value;
	
	@Override
	public boolean isAddSubject(final SubjectModel smodel) {
		try 
		{
		   value=template.update("insert into subject values ('0',?,1)",new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, smodel.getName());	
				}	
			});
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
		}
		return value>0?true:false;
	}
	
	public boolean isSubjectAvailable(String subName) {
		try
		{
			String s=template.queryForObject("select subjectname from subject where subjectname like '"+subName+"'", String.class);
			return s.length()>0?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);	
			return false;
		}
	}

	@Override
	public List<SubjectModel> getAllSubject() {
		try
		{
			list=template.query("select *from subject where status=1", new RowMapper<SubjectModel>() {

				@Override
				public SubjectModel mapRow(ResultSet rs, int rowNum) throws SQLException {
					SubjectModel sm=new SubjectModel();
					sm.setId(rs.getInt(1));
					sm.setName(rs.getString(2));
					return sm;
				}
			});
		}
		catch(Exception ex)
		{
			return null;
		}
		return list.size()>0?list:null;
	}

	@Override
	public List<SubjectModel> getAllSubjectByName(String str) {
		try
		{
			list=template.query("select *from subject where status=1 and subjectname like '%"+str+"%' ", new RowMapper<SubjectModel>() {

				@Override
				public SubjectModel mapRow(ResultSet rs, int rowNum) throws SQLException {
					SubjectModel sm=new SubjectModel();
					sm.setId(rs.getInt(1));
					sm.setName(rs.getString(2));
					return sm;
				}
			});
		}
		catch(Exception ex)
		{
			return null;
		}
		return list.size()>0?list:null;
	}

	@Override
	public boolean finalSubjectUpdate(final SubjectModel model) {
		try
		{
			int value=template.update("update subject set subjectname=? where subid=?",new PreparedStatementSetter() {

				@Override
				public void setValues(PreparedStatement ps) throws SQLException {
					ps.setString(1, model.getName());
					ps.setInt(2, model.getId());	
				}
			});
			return value>0?true:false;
		}
		catch(Exception ex)
		{
			return false;
		}
		
	}

	@Override
	public boolean isDisableSubject(int sid) {
		try
		{
			int value=template.update("update subject set status=0 where subid="+sid);
			return value>0?true:false;
		}
		catch(Exception ex)
		{
			return false;
		}
	}


	
}
