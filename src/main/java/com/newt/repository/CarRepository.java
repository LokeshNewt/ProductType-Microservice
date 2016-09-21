package com.newt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.newt.model.Car;
@Repository
public interface CarRepository extends CrudRepository<Car, String>{

}
