package org.feedback.FeedBackApp.repository;

import org.feedback.FeedBackApp.model.QualModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("qualRepo")
public class QualificationRepositoryImpl implements QualificationRepository{

	@Autowired
	JdbcTemplate template;
	
	@Override
	public boolean isAddQual(QualModel model) {
		int value = template.update("insert into qualification values ('0',?)",new Object[] {model.getName()});
		if(value>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	

}
