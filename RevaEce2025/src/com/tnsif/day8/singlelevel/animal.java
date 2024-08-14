package com.tnsif.day8.singlelevel;

public class animal {
	    String name;

	    // Constructor
	    animal(String name) {
	        this.name = name;
	    }

	    // Method
	    void eat() {
	        System.out.println(name + " is eating.");
	    }
	}

	// Child class (Derived class) inheriting from Animal
	class Dog extends animal {
	    // Constructor calling parent constructor
	    Dog(String name) {
	        super(name);
	    }

	    // Additional method
	    void bark() {
	        System.out.println(name + " is barking.");
	    }


}
