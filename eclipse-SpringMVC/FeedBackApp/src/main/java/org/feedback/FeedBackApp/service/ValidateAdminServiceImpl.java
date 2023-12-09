package org.feedback.FeedBackApp.service;

import org.feedback.FeedBackApp.model.AdminProfileModel;
import org.feedback.FeedBackApp.repository.AdminValidateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("adminService")
public class ValidateAdminServiceImpl implements ValidateAdminService{

	@Autowired
	AdminValidateRepo adminRepo;
	
	@Override
	public AdminProfileModel validateAdmin(AdminProfileModel model) {
		
		return adminRepo.validateAdmin(model);
	}

}