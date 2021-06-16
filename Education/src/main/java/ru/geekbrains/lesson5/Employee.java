package ru.geekbrains.lesson5;

public class Employee {
    String name;
    String position;
    String email;
    String phoneNumber;
    float salary;
    int age;

    public Employee (String name, String position, String email, String phoneNumber, float salary, int age) {
        this.name=name;
        this.position=position;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.salary=salary;
        this.age=age;
    }

    public void print () {
        System.out.println("Person: " + this.name + ", position: " + this.position + ", age:" + this.age + ", phone: " + this.phoneNumber + ", email:" + this.email);
    }

}

