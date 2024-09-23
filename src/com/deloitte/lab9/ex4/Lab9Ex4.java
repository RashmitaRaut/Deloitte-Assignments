package com.deloitte.lab9.ex4;

public class Lab9Ex4 {

 public static void main(String[] args) {
     PersonFactory personFactory = Person::new;

     Person person = personFactory.createPerson("John", 25);

     System.out.println("Name: " + person.getName());
     System.out.println("Age: " + person.getAge());
 }
}

class Person {
 private String name;
 private int age;

 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public int getAge() {
     return age;
 }

 public void setAge(int age) {
     this.age = age;
 }
}

interface PersonFactory {
 Person createPerson(String name, int age);
}

