package org.feedback.FeedBackApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TrainerController {

	@RequestMapping(value="/newtrainer",method=RequestMethod.GET)
	public String newTrainer() {
		return "newtrainer";
	}
}
