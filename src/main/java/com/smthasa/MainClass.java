package com.smthasa;

import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import com.google.inject.name.Named;

public class MainClass {

	private String secret1;
	private String secret2;
	private List<Integer> list;
	private ObjectMapper objectMapper;

	@Inject
	public MainClass(@Named("secret1") String secret1,
					 @Named("secret2") String secret2,
					 List<Integer> list,
					 ObjectMapper objectMapper) {
		this.secret1 = secret1;
		this.secret2 = secret2;
		this.list = list;
		this.objectMapper = objectMapper;
	}

	public String execute() {
		return secret1 + ": " + list + " " + secret2;
	}

}
