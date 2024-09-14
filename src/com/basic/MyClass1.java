package com.basic;

import java.util.Objects;

public class MyClass1 {
    private String name;

    public MyClass1(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyClass1 myClass = (MyClass1) obj;
        return name.equals(myClass.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "MyClass{name='" + name + "'}";
    }

    public static void main(String[] args) {
        MyClass1 obj1 = new MyClass1("Example");
        MyClass1 obj2 = new MyClass1("Example");
        
        System.out.println(obj1.equals(obj2)); // Output: true
        System.out.println(obj1.hashCode() == obj2.hashCode()); // Output: true
        System.out.println(obj1.toString()); // Output: MyClass{name='Example'}
    }
}
