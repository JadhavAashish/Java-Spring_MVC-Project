package org.feedback.FeedBackApp.service;

import org.feedback.FeedBackApp.model.QualModel;
import org.feedback.FeedBackApp.repository.QualificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("qualService")
public class QualificatioServiceImpl implements QualificationService {

	@Autowired
	QualificationRepository qualRepo;
	
	@Override
	public boolean isAddQual(QualModel model) {
		// TODO Auto-generated method stub
		return qualRepo.isAddQual(model);
	}

}
