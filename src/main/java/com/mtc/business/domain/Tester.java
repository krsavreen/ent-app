package com.mtc.business.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @EqualsAndHashCode @ToString
public class Tester {

	private String name;
	
	public Tester() {
		// TODO Auto-generated constructor stub
	}

	public Tester(String name) {
		super();
		this.name = name;
	}
	
	public void test() {
		System.out.println("Test [" + name + "]");
	}
}
