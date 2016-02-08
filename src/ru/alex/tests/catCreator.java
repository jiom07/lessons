package ru.alex.tests;

import ru.alex.zoo.Animal;
import ru.alex.zoo.Cat;

public class catCreator implements AbstractCreator {

@Override
public Animal create() {
	return  new Cat("");
}
}
