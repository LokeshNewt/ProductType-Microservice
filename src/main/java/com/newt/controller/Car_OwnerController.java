package com.newt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.newt.model.Car;
import com.newt.model.Car_Owner;
import com.newt.repository.Car_OwnerRepository;
import com.wordnik.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/car_owner")
public class Car_OwnerController {

	@Autowired
	private Car_OwnerRepository car_ownerRepo;
	
	@RequestMapping(value="",method = RequestMethod.GET)
	public Iterable findAll() {
		return car_ownerRepo.findAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Car_Owner find(@PathVariable Integer id) {
           return car_ownerRepo.findOne(id);        
    }
	
	@ApiOperation(value = "post a product")
    @RequestMapping(method = RequestMethod.POST)
    public Car_Owner create(@RequestBody Car_Owner car_Owner ) {
        return car_ownerRepo.save(car_Owner);
    }
}
