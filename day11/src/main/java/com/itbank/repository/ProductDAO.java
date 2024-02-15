package com.itbank.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.itbank.model.ProductDTO;

@Repository
public interface ProductDAO {

	List<ProductDTO> selectList();

	int insert(ProductDTO dto);

	ProductDTO selectOne(int idx);

	int update(ProductDTO dto);

	int delete(int idx);

}
