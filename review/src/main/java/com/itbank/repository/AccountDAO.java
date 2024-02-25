package com.itbank.repository;

import org.springframework.stereotype.Repository;

import com.itbank.model.AccountDTO;

@Repository
public interface AccountDAO {

	AccountDTO login(AccountDTO dto);

	int insert(AccountDTO dto);

	int updatePass(AccountDTO dto);

}
