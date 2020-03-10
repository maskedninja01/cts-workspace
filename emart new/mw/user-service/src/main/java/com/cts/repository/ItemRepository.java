package com.cts.repository;

import org.springframework.data.repository.CrudRepository;

import com.cts.entities.Item;

public interface ItemRepository extends CrudRepository<Item, Long> {

}
