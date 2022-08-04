package com.m2i.tpzoo;

public class TpZoo {

	public static void main(String[] args) {
		
		System.out.println("TP ZOO");
		
		Zoo zoo = new Zoo();
		
		Chien chien = new Chien("Médor");
//		System.out.println(chien.toString());
//		System.out.println(chien.getCri());
		zoo.ajouter(chien);
		
		Chat chat = new Chat("Felix");
//		System.out.println(chat.toString());
//		System.out.println(chat.getCri());
		zoo.ajouter(chat);
		
		Tigre monTigre = new Tigre();
//		System.out.println(monTigre.pousserCri());
		zoo.ajouter(monTigre);
		
		
		for(Animal animal : zoo.getAnimaux()) {
			System.out.println(animal.pousserCri());
		}
	}
}
