package com.java8;

//Before Java 8
//public class Java8Example {
// public static void main(String[] args) {
//     MyInterface implementation = new MyInterface() {
//         @Override
//         public void myAbstractMethod() {
//             System.out.println("Hello from myAbstractMethod!");
//         }
//     };
//
//     implementation.myAbstractMethod(); // Call the implemented method
// }
//}

//Java 8: Using lambda expression
public class Java8Example {
 public static void main(String[] args) {
     MyInterface implementation = () ->{System.out.println("Hello from myAbstractMethod!");};

     implementation.myAbstractMethod(); // Call the implemented method
 }
}