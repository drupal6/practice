package com.practice.content.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.content.service.AnswerResourceTypeService;
import com.practice.result.Result;

@RestController
@RequestMapping("answerResourceType")
public class AnswerResourceTypeController {

	@Autowired
	private AnswerResourceTypeService answerResourceTypeService;
	
	@RequestMapping("list")
	public Result<?> getAnswerResourceTypeList() {
		return answerResourceTypeService.getAnswerResourcetypesList();
	}
}
