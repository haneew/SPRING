package com.itbank.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.itbank.model.ReviewDTO;

@Repository

public interface ReviewDAO {

	List<ReviewDTO> selectList();

	int insert(ReviewDTO dto);

	ReviewDTO selectOne(int idx);

	int delete(int idx);

}
