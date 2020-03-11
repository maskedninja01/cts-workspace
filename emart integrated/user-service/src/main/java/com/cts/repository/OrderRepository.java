package com.cts.repository;

import org.springframework.data.repository.CrudRepository;

import com.cts.entities.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
