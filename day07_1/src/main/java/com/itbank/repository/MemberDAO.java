package com.itbank.repository;


import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.itbank.model.MemberDTO;

@Repository
public interface MemberDAO {
	
	
	@Select("select * from member where userid = #{userid} and userpw = #{userpw}")
	MemberDTO login(MemberDTO dto);

}
