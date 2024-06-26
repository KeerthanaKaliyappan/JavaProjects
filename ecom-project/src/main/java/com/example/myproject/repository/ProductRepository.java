package com.example.myproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.myproject.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{
	
	Product findByProductid(long productid);
	
	@Query(value ="SELECT p FROM Product p WHERE p.productname LIKE :keyword% ")
	List<Product> findByProductname(String keyword);

}
