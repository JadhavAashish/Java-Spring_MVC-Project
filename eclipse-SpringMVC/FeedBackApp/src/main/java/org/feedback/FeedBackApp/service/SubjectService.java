package org.feedback.FeedBackApp.service;

import java.util.List;

import org.feedback.FeedBackApp.model.SubjectModel;

public interface SubjectService {
	
	public boolean isAddSubject(SubjectModel smodel);
	public boolean isSubjectAvailable(String subName);
	public List<SubjectModel> getAllSubject();
	public List<SubjectModel> getAllSubjectByName(String str);
	public boolean finalSubjectUpdate(SubjectModel model);
	public boolean isDisableSubject(int sid);
}
