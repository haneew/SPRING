package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.component.FileComponent;
import com.itbank.model.ProductDTO;
import com.itbank.repository.ProductDAO;

@Service
public class ProductService {

	@Autowired private ProductDAO dao;
	@Autowired private FileComponent fileComponent;
	
	public List<ProductDTO> getList() {
		return dao.selectList();
	}

	public int add(ProductDTO dto) {
		String image = fileComponent.upload(dto.getUpload());
		dto.setPimg(image);
		return dao.insert(dto);
	}

	public ProductDTO getView(int idx) {
		return dao.selectOne(idx);
	}

	public int modify(ProductDTO dto) {
		return dao.update(dto);
	}

	public int delete(int idx) {
		return dao.delete(idx);
	}

}
