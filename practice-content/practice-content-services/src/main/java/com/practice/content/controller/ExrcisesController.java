package com.practice.content.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.content.service.ExrcisesService;
import com.practice.content.vo.TExrcises;
import com.practice.result.DataTablesData;
import com.practice.result.Result;

@RestController
@RequestMapping("exrcises")
@ResponseBody
public class ExrcisesController {

	@Autowired
	private ExrcisesService exrcisesService;
	
	@RequestMapping(value = "list/{languageId}/{subjectId}/{gradeId}/{authId}", method = RequestMethod.GET)
	public Result<DataTablesData> exrcisesList(@PathVariable int languageId, @PathVariable int subjectId, 
			@PathVariable int gradeId, @PathVariable long authId) {
		List<TExrcises> list = exrcisesService.getExrcisesList(languageId, subjectId, gradeId, authId);
		DataTablesData data = new DataTablesData();
		data.setData(list);
		Result<DataTablesData> result = new Result<>();
		result.setResult(data);
		return result;
	}
	
	@RequestMapping(value="add", method=RequestMethod.POST)
	public String addExrcises() {
		return null;
	}
}
