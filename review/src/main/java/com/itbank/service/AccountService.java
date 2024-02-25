package com.itbank.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.component.HashComponent;
import com.itbank.model.AccountDTO;
import com.itbank.repository.AccountDAO;

@Service

public class AccountService {

	@Autowired private AccountDAO dao;
	@Autowired private HashComponent hashComponent;
	
	public AccountDTO getLogin(AccountDTO dto) {
		String hash = hashComponent.getHash(dto.getUserpw());
		dto.setUserpw(hash);
		return dao.login(dto);
	}

	public int add(AccountDTO dto) {
		String hash = hashComponent.getHash(dto.getUserpw());
		dto.setUserpw(hash);
		return dao.insert(dto);
	}

	public String resetPass(AccountDTO dto) {
		String newPass = UUID.randomUUID().toString().replace("-", "").substring(0, 8);
		String hash = hashComponent.getHash(newPass);
		dto.setUserpw(hash);
		int row = dao.updatePass(dto);
		return row != 0 ? newPass : null;
	}
	
	

	
	
	
}
