package com.m2i.tpzoo;

public class TpZoo {

	public static void main(String[] args) {
		
		System.out.println("TP ZOO");
		
		Animal chien = new Animal("Médor", "wouaf");
		System.out.println(chien.toString());
		System.out.println(chien.getCri());
		
		Animal chat = new Animal("Felix", "miaou");
		System.out.println(chat.toString());
		System.out.println(chat.getCri());
	}
}
