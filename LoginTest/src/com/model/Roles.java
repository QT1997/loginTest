package com.model;

import java.util.List;

public class Roles {
	private String id;
	private String name;
	private List<Permision> permisions;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Permision> getPermisions() {
		return permisions;
	}

	public void setPermisions(List<Permision> permisions) {
		this.permisions = permisions;
	}

	public Roles(String id, String name, List<Permision> permisions) {
		super();
		this.id = id;
		this.name = name;
		this.permisions = permisions;
	}

	public Roles() {
		super();
	}

}
