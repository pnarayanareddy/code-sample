package com.basic;

import java.util.Objects;



public class Main {
	class Person {
	    private String name;
	    private int age;

	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;  // Same object
	        }
	        if (obj == null || getClass() != obj.getClass()) {
	            return false;  // Null or different class
	        }
	        Person person = (Person) obj;
	        return age == person.age && name.equals(person.name);  // Compare fields
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(name, age);  // Ensure compatibility with equals()
	    }
	}
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Alice", 25);
        System.out.println(p1.equals(p2));  // true
    }
}
