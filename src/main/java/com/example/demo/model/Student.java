package com.example.demo.model;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
         return "{" +
                 "name="+name +
                 "age="+age
                +"}";
    }
}
