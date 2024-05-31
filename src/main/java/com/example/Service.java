package com.example;

import java.util.List;

public class Service {

  String aaa = 123;
	public void create(List<Object> args) {
		var second = (java.util.Optional<String>) args.get(2);
		System.out.println("foo");
	}
}