package com.itbank.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.SurveyDTO;
import com.itbank.repository.SurveyDAO;


@Service
public class SurveyService {

	@Autowired private SurveyDAO dao;
	private String saveDirectory = "C:\\upload";
	
	
	public SurveyService() {
		File dir = new File(saveDirectory);
		if(dir.exists() == false) {
			dir.mkdirs();
		}
	}
	
	public List<SurveyDTO> getList() {
		return dao.selectList();
	}

	public SurveyDTO getSurvey(int idx) {
		return dao.selectOne(idx);
	}

	public int write(SurveyDTO dto) {
		String image1 = dto.getUpload1().getOriginalFilename();
		String image2 = dto.getUpload2().getOriginalFilename();
		
		File f1 = new File(saveDirectory,image1);
		File f2 = new File(saveDirectory,image2);
		try {
			dto.getUpload1().transferTo(f1);
			dto.getUpload2().transferTo(f2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		dto.setImage1(image1);	// dto image에 빈값이 들어가니까 upload로 셋팅한 값을 
		dto.setImage2(image2);	// set해서 dto로 다시 넘겨준다.
		
		return dao.insert(dto);
	}

}
