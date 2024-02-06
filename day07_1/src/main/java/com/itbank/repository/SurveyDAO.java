package com.itbank.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.itbank.model.SurveyDTO;

@Repository
public interface SurveyDAO {

	@Select("select * from survey order by idx")
	List<SurveyDTO> selectList();
	
	@Select("select * from survey where idx = #{idx}")
	SurveyDTO selectOne(int idx);
	
	@Insert(" insert into survey (title, writer, content1, content2, image1, image2) "
				+ " values "
				+ " (#{title}, #{writer}, #{content1}, #{content2},#{image1}, #{image2}) ")
	int insert(SurveyDTO dto);
	
	
	
}
