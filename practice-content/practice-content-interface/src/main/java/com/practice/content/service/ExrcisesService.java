package com.practice.content.service;

import java.util.List;

import com.practice.content.vo.TExrcises;

public interface ExrcisesService {
	
	List<TExrcises> getExrcisesList(int languageId, int subjectId, int gradeId, long authId);
	
	int addExrcises(TExrcises exricises);
	
	int updateExrcises(TExrcises exricises);
	
	int deleteExrcises(Long id);
	
}
