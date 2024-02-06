package com.itbank.repository;

import org.apache.ibatis.annotations.Insert;

public interface ChoiceDAO {

	@Insert("insert into survey_choice (choice)"
			+ "values"
			+ " (#{choice)")
	int choice(int idx);



	
}
