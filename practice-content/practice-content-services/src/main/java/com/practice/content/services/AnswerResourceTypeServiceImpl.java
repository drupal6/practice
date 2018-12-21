package com.practice.content.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.content.mapper.TAnswerResourceTypeMapper;
import com.practice.content.service.AnswerResourceTypeService;
import com.practice.content.vo.TAnswerResourceType;
import com.practice.content.vo.TAnswerResourceTypeExample;
import com.practice.result.DataTablesData;
import com.practice.result.Result;

@Service
public class AnswerResourceTypeServiceImpl implements AnswerResourceTypeService{

	@Autowired
	private TAnswerResourceTypeMapper answerResourceTypeMapper;
	
	@Override
	public Result<DataTablesData> getAnswerResourcetypesList() {
		TAnswerResourceTypeExample example = new TAnswerResourceTypeExample();
		List<TAnswerResourceType> list = answerResourceTypeMapper.selectByExample(example);
		DataTablesData data = new DataTablesData();
		data.setData(list);
		Result<DataTablesData> result = new Result<>();
		result.setResult(data);
		return result;
	}

	@Override
	public int addAnswerResourceType(TAnswerResourceType answerResourceType) {
		return answerResourceTypeMapper.insert(answerResourceType);
	}

	@Override
	public int updateAnswerResourceType(TAnswerResourceType answerResourceType) {
		return answerResourceTypeMapper.updateByPrimaryKey(answerResourceType);
	}

	@Override
	public int deleteAnswerResourceType(Long id) {
		return answerResourceTypeMapper.deleteByPrimaryKey(id);
	}
}
