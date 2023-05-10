package com.smthasa;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ApplicationLauncher {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new MainClassModule());
		String result = injector.getInstance(MainClass.class).execute();
		System.out.println(result);
	}
}
