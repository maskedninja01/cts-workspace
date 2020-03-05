package com.cts.repository;

import org.springframework.data.repository.CrudRepository;

import com.cts.entities.Buyer;

public interface BuyerRepository extends CrudRepository<Buyer, Integer> {

}
