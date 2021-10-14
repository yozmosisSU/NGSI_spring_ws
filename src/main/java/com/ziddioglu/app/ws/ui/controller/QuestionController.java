package com.ziddioglu.app.ws.ui.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ziddioglu.app.ws.io.entity.Question;
import com.ziddioglu.app.ws.service.QuestionService;

//(origins = "http://localhost:8081")

@CrossOrigin 
@RestController
@RequestMapping("questions")
public class QuestionController {
	
	
	@Autowired
	QuestionService questionService;
	
	
	@GetMapping
	public List<Question> getQuestions() {
		
		
		
		return questionService.getAllQuestions();
		
	}
	
}
