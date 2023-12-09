package org.feedback.FeedBackApp.service;

import java.util.List;

import org.feedback.FeedBackApp.model.SubjectModel;
import org.feedback.FeedBackApp.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("subService")
public class SubjectServiceImpl implements SubjectService{

	@Autowired
	SubjectRepository subjectRepo;
	
	@Override
	public boolean isAddSubject(SubjectModel smodel) {
		// TODO Auto-generated method stub
		return subjectRepo.isAddSubject(smodel);
	}

	@Override
	public boolean isSubjectAvailable(String subName) {
		// TODO Auto-generated method stub
		return subjectRepo.isSubjectAvailable(subName);
	}

	@Override
	public List<SubjectModel> getAllSubject() {
		// TODO Auto-generated method stub
		return subjectRepo.getAllSubject();
	}

	@Override
	public List<SubjectModel> getAllSubjectByName(String str) {
		// TODO Auto-generated method stub
		return subjectRepo.getAllSubjectByName(str);
	}

	@Override
	public boolean finalSubjectUpdate(SubjectModel model) {
		// TODO Auto-generated method stub
		return subjectRepo.finalSubjectUpdate(model);
	}

	@Override
	public boolean isDisableSubject(int sid) {
		// TODO Auto-generated method stub
		return subjectRepo.isDisableSubject(sid);
	}

	

	

}
