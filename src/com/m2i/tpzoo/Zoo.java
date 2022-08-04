package com.m2i.tpzoo;

import java.util.ArrayList;

public class Zoo {
	
	/*
	private Animal[] animaux = new Animal[10];
	private int nombreAnimal = 0;
	
	
	public void add(Animal animal) {
		animaux[nombreAnimal] = animal;
		nombreAnimal++;
	}
	
	public int size() {
		return nombreAnimal;
	}
	*/
	
	
	
	private ArrayList<Animal> animaux = new ArrayList<>();
	
	
	public void ajouter(Animal animal) {
		animaux.add(animal);
	}


	public ArrayList<Animal> getAnimaux() {
		return animaux;
	}

	
	
}
