package com.cts.swrd.model;

import java.io.Serializable;

public class AppSecurityToken implements Serializable {
	private static final long serialVersionUID = -21212121212121L;
	private final String jwttoken;

	public AppSecurityToken(String jwttoken) {
		super();
		this.jwttoken = jwttoken;
	}

	public String getToken() {
		return this.jwttoken;
	}

}
