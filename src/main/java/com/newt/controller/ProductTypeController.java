package com.newt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.newt.model.Car;
import com.newt.model.ProductType;
import com.newt.repository.ProductTypeRepository;
import com.wordnik.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/products")
public class ProductTypeController {
	
	@Autowired
	private ProductTypeRepository productTypeRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public Iterable findAll() {
		return productTypeRepository.findAll();
	}
	
	
	@ApiOperation(value = "post a product")
    @RequestMapping(method = RequestMethod.POST)
    public ProductType create(@RequestBody ProductType productType) {
        return productTypeRepository.save(productType);
    }

}
