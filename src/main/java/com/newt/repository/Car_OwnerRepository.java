package com.newt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.newt.model.Car_Owner;

@Repository
public interface Car_OwnerRepository extends CrudRepository<Car_Owner, Integer> {

}
