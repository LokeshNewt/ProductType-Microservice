package com.newt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.newt.model.Car;
import com.newt.repository.CarRepository;
import com.wordnik.swagger.annotations.ApiOperation;
@RestController
@RequestMapping("/cars")
public class CarController {
	private final CarRepository carRepo;
	@Autowired
	public CarController(CarRepository carrepo){
		this.carRepo = carrepo;
	}
	@RequestMapping(method = RequestMethod.GET)
	public Iterable findAll() {
		return carRepo.findAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Car find(@PathVariable String id) {
           return carRepo.findOne(id);        
    }
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable String id){
		carRepo.delete(id);
		return "Car Deleted Successfully";
	}
	/*@RequestMapping(method = RequestMethod.DELETE)
    public String deleteAllCars(){
		carRepo.deleteAll();		
		return "Deleted all the cars Successfully";		
	}
	*/
	
	@ApiOperation(value = "post a product")
    @RequestMapping(method = RequestMethod.POST)
    public Car create(@RequestBody Car car) {
        return carRepo.save(car);
    }
}
