package com.practice.content.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.content.mapper.TExrcisesMapper;
import com.practice.content.service.ExrcisesService;
import com.practice.content.vo.TExrcises;
import com.practice.content.vo.TExrcisesExample;
import com.practice.content.vo.TExrcisesExample.Criteria;

@Service
public class ExrcisesServiceImpl implements ExrcisesService{

	@Autowired
	private TExrcisesMapper tExrcisesMapper;
	
	@Override
	public List<TExrcises> getExrcisesList(int languageId, int subjectId, int gradeId, long authId) {
		TExrcisesExample example = new TExrcisesExample();
		Criteria criteria = example.createCriteria();
		if(languageId > 0) {
			criteria.andLanguageIdEqualTo(languageId);
		}
		if(subjectId > 0) {
			criteria.andSubjectIdEqualTo(subjectId);
		}
		if(gradeId > 0) {
			criteria.andGradeIdEqualTo(gradeId);
		}
		if(authId > 0) {
			criteria.andAuthIdEqualTo(authId);
		}
		criteria.andStatesGreaterThanOrEqualTo((byte)0);
		return tExrcisesMapper.selectByExample(example);
	}

	@Override
	public int addExrcises(TExrcises exricises) {
		return tExrcisesMapper.insert(exricises);
	}

	@Override
	public int updateExrcises(TExrcises exricises) {
		return tExrcisesMapper.updateByPrimaryKey(exricises);
	}

	@Override
	public int deleteExrcises(Long id) {
		return tExrcisesMapper.deleteByPrimaryKey(id);
	}

}
