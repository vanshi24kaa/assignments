package com.company.jwt.springsecurity.springsecurityjwt.models;

public class AuthenticationResponse {
private final String jwt;
public AuthenticationResponse(String jwt) {
	super();
	this.jwt = jwt;
}

public String getJwt() {
	return jwt;
}
}
