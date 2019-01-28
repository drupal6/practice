package com.practice.content.service;

import com.practice.content.vo.TAnswerResourceType;
import com.practice.result.DataTablesData;
import com.practice.result.Result;

public interface AnswerResourceTypeService {

	Result<DataTablesData>  getAnswerResourcetypesList();
	
	int addAnswerResourceType(TAnswerResourceType answerResourceType); 
	
	int updateAnswerResourceType(TAnswerResourceType answerResourceType);
	
	int deleteAnswerResourceType(Long id);
}
