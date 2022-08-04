package com.m2i.tpzoo;

public class Chat extends Animal {

	
	public Chat(String nom) {
		super(nom, "miaou");
	}
	
	public String pousserCri() {
		return getCri() + " " + getCri();
	}
}
