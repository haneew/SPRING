package com.itbank.service;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.ReviewDTO;
import com.itbank.repository.ReviewDAO;

@Service

public class ReviewService {

	@Autowired private ReviewDAO dao;
	private String saveDirectory = "C:\\upload";
	
	public List<ReviewDTO> getList() {
		return dao.selectList();
	}

	public int write(ReviewDTO dto) {
		String fileName = dto.getUpload().getOriginalFilename();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss_");
		String today = sdf.format(date);
		String image = today + fileName;
		
		File f = new File(saveDirectory, image);
		
		try {
			dto.getUpload().transferTo(f);
		} catch (Exception e) {
			e.printStackTrace();
		}
		dto.setImage(image);
		return dao.insert(dto);
	}

	public ReviewDTO getView(int idx) {
		return dao.selectOne(idx);
	}

	public int delete(int idx) {
		ReviewDTO dto = dao.selectOne(idx);
		File f = new File(saveDirectory, dto.getImage());
		if(f.exists()) {
			f.delete();
		}
		int row = dao.delete(idx);
		return row;
	}

}
