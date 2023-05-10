package com.smthasa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;

public class MainClassModule extends AbstractModule {

	@Provides
	@Named("secret1")
	public static String provideSecret1() {
		return "I like toes";
	}

	@Provides
	@Named("secret2")
	public static String provideSecret2() {
		return "I like feet";
	}

	@Provides
	public static List<Integer> provideList() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		return Collections.unmodifiableList(list);
	}

	@Provides
	public static ObjectMapper provideObjectMapper() {
		return new ObjectMapper();
	}

}
