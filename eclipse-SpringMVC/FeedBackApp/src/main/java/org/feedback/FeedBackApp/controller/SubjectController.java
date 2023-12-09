package org.feedback.FeedBackApp.controller;

import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.feedback.FeedBackApp.model.SubjectModel;
import org.feedback.FeedBackApp.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SubjectController {
	
	@Autowired
	SubjectService subService;
	
	
	@RequestMapping(value="/newsub",method=RequestMethod.GET)
	public String newSubject() {
		return "NewSubject";
	}

	@RequestMapping(value="/savesub",method=RequestMethod.POST)
	public String saveSubject(SubjectModel smodel,Map map) {
		boolean b= subService.isAddSubject(smodel);
		if(b)
		{
			map.put("msg", "New Subject Added");
		}
		else
		{
			map.put("msg", "Subject Not Added");
		}
		return "NewSubject";
	}
	
	@RequestMapping(value="/checkSubject",method=RequestMethod.GET)
	@ResponseBody
	public String checkSubjectExistance(@RequestParam("subName") String subName) {
		boolean b=subService.isSubjectAvailable(subName);
		if(b)
		{
			return "Subject Already Exists";
		}
		else {
		return "";
		}
	}
	
	@RequestMapping(value="/viewallsub")
	public ModelAndView getAllSubject() {
		ModelAndView mv=new ModelAndView();
		List<SubjectModel> list = subService.getAllSubject();
		if(list!=null)
		{
			mv.addObject("subjectlist",list);
		}
		else
		{
			mv.addObject("msg", "there is no subject");
		}
		mv.setViewName("viewsubject");
		return mv;	
	}
	
	@RequestMapping(value="/searchSubject")
	@ResponseBody
	public String searchSubject(@RequestParam("subName") String str) {
		List<SubjectModel> list=subService.getAllSubjectByName(str);
		String table="<table>";
		if(list!=null)
		{
			table=table+"<tr><th>Subject Name</th><th>Update Subject</th><th>Disable Subject</th></tr>";
			for(SubjectModel model:list)
			{
				table=table+"<tr><td>"+model.getName()+"</td><td><a href=''>Update</a></td><td><a href=''>Disable</a></td></tr>";
			}
			table=table+"</table>";
		}
		return table;	
	}
	
	@RequestMapping(value="/updateSubject",method=RequestMethod.GET)
	public ModelAndView updateSubjectURL(@RequestParam("subName") String subName,@RequestParam("id") Integer subId) {
		ModelAndView mv=new ModelAndView();
		
		mv.addObject("sname", subName);
		mv.addObject("sid", subId);
		mv.setViewName("updatesubject");
		return mv;
	}
	
	@RequestMapping(value="/finalSubjectUpdate",method=RequestMethod.POST)
	public String finalUpdate(SubjectModel model,Map map) {
		
		boolean b=this.subService.finalSubjectUpdate(model);
		if(b)
		{
			return "redirect:viewallsub";
		}
		else
		{
			map.put("msg", "Some Problem Occured");
			return "redirect:updatesubject";
		}
	}
	
	@RequestMapping(value="/disableSubject",method=RequestMethod.GET)
	public String disableSubject(@RequestParam("subId") Integer sid) {
		
		boolean b=subService.isDisableSubject(sid);
		return "redirect:viewallsub";
		
	}
}
