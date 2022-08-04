package com.m2i.tpzoo;

public class TpZoo {

	public static void main(String[] args) {
		
		System.out.println("TP ZOO");
		
		Chien chien = new Chien("Médor");
		System.out.println(chien.toString());
		System.out.println(chien.getCri());
		
		Chat chat = new Chat("Felix");
		System.out.println(chat.toString());
		System.out.println(chat.getCri());
		
		Tigre monTigre = new Tigre();
		System.out.println(monTigre.pousserCri());
	}
}
