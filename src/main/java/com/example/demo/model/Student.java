package com.example.demo.model;
import javax.persistence.*;

@Table
@Entity(name= "student")
public class Student {
    @Id
    @GeneratedValue(
            strategy= GenerationType.IDENTITY
    )
    @Column(name = "ID", updatable = false)
    private long id ;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private int age;
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    @Column(nullable = false, unique = true)
    private String email;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public Student(String firstName, int age, String email) {
        this.firstName = firstName;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString(){
         return "{" +
                 "name="+firstName +
                 "age="+age
                +"}";
    }
}
