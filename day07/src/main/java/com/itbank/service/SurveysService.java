package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.SurveysDTO;
import com.itbank.repository.SurveysDAO;


@Service
public class SurveysService {

	@Autowired private SurveysDAO dao;
	
	public List<SurveysDTO> getList() {
		return dao.selectList();
	}

	public SurveysDTO getSurvey(int idx) {
		return dao.selectOne(idx);
	}

	public int write(SurveysDTO dto) {
		return dao.insert(dto);
	}

}
