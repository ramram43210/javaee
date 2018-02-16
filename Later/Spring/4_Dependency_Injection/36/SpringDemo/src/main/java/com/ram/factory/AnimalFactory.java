package com.ram.factory;

import com.ram.model.Animal;
import com.ram.model.Dog;

public class AnimalFactory
{
	public static Animal getAnimal()
	{
		return new Dog();// return any one instance, either Dog or Cow
		// return new Cow();
	}
}
