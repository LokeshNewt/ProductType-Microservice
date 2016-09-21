package com.newt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.newt.model.ProductType;

@Repository
public interface ProductTypeRepository extends CrudRepository<ProductType, String>{

}
