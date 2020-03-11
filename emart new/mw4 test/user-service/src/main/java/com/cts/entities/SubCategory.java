package com.cts.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class SubCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long subCategoryId;
	private String subCategoryName;
	private String description;

	@OneToMany(mappedBy = "subCategory")
	private List<Item> items;

	public Long getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(Long subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public SubCategory(Long subCategoryId) {
		super();
		this.subCategoryId = subCategoryId;
	}

	public SubCategory() {
		super();
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
}
