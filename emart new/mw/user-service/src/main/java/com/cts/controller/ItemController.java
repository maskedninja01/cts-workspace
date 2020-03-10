package com.cts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.entities.Item;
import com.cts.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService service;
	
	@RequestMapping("/all")
	List<Item> getAll() {
		return service.getItems();
	}

	@RequestMapping("/{itemId}")
	Optional<Item> getById(@PathVariable Long itemId) {
		return service.getItemById(itemId);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/add")
	void addItem(@RequestBody Item item, @PathVariable Long userId, @PathVariable Long subCategoryId, @PathVariable Long discountId) {
		item.sel
		service.addItem(item);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{itemId}")
	void deleteCategoryById(@PathVariable Long itemId) {
		service.deleteItem(itemId);
	}
	@RequestMapping(method = RequestMethod.PUT)
	void updateItem(@RequestBody Item item) {
		service.updateItem(item);
	}
}
