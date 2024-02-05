package com.itbank.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.itbank.model.SurveysDTO;

@Repository
public interface SurveysDAO {

	List<SurveysDTO> selectList();
	
	SurveysDTO selectOne(int idx);

	int insert(SurveysDTO dto);
	
	
	
}
