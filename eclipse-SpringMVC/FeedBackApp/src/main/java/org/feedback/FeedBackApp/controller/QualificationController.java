package org.feedback.FeedBackApp.controller;

import org.feedback.FeedBackApp.model.QualModel;
import org.feedback.FeedBackApp.service.QualificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
public class QualificationController {

	@Autowired
	QualificationService qualService;
	
	@RequestMapping(value="saveQual",method=RequestMethod.POST)
	public String saveQualification(QualModel model,Map map) {
		boolean b = qualService.isAddQual(model);
		if(b)
		{
			map.put("msg", "Qualification Added");
			return "newtrainer";
		}
		else
		{
			map.put("msg", "Qualification Not Added");
			return "newtrainer";
		}
	}
	
	@RequestMapping(value="/getQuals",method=RequestMethod.GET)
	public @ResponseBody QualModel getQualifications() {
		QualModel qmodel  = new QualModel();
		qmodel.setId(1);
		qmodel.setName("MCA");
		return qmodel;
		
	}
}
