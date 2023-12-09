package org.feedback.FeedBackApp.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.feedback.FeedBackApp.model.AdminProfileModel;
import org.feedback.FeedBackApp.service.ValidateAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@Autowired
	ValidateAdminService adminService;

	@RequestMapping(value="/")
	public String test(HttpServletResponse response) throws IOException{
		return "home";
	}
	
	@RequestMapping(value="/validateAdmin",method=RequestMethod.POST)
	public ModelAndView validateAdmin(AdminProfileModel model) {
		ModelAndView mv=new ModelAndView();
		
		AdminProfileModel m = adminService.validateAdmin(model);
		if(m!=null)
		{
			mv.addObject("msg"," ");
			mv.setViewName("admindashboard");
		}
		else
		{
			mv.addObject("msg","Invalid Username and password");
			mv.setViewName("home");
		}
		return mv;
	}
	
}
