package org.feedback.FeedBackApp.repository;

import org.feedback.FeedBackApp.model.AdminProfileModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

@Repository("adminRepo")
public class AdminValidateRepoImpl implements AdminValidateRepo{

	@Autowired
	JdbcTemplate template;
	
	@Override
	public AdminProfileModel validateAdmin(AdminProfileModel model) {
		
		List<AdminProfileModel> list = template.query("select *from adminprofile where email=? and password=?", 
	      new Object[] {model.getEmail(),model.getPassword()},
		  new RowMapper<AdminProfileModel>() {

			@Override
			public AdminProfileModel mapRow(ResultSet rs, int rowNum) throws SQLException {
				AdminProfileModel admodel = new AdminProfileModel();
				admodel.setId(rs.getInt(1));
				admodel.setName(rs.getString(2));
				admodel.setEmail(rs.getString(3));
				admodel.setContact(rs.getString(4));
				admodel.setPassword(rs.getString(5));
				return admodel;
			}
			
		});
		return list.size()>0?list.get(0):null;
	}
}
