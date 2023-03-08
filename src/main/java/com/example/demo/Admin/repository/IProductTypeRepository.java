package com.example.demo.Admin.repository;

import com.example.demo.Admin.model.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductTypeRepository extends JpaRepository<ProductType, Long> {

}