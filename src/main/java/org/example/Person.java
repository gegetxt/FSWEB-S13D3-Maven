package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    // Eklediğimiz 3 ek instance variable
    private String phoneNumber;
    private String email;
    private String city;

    // Constructor 1
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Constructor 2 - overloading + constructor chaining
    public Person(String firstName, String lastName, int age,
                  String phoneNumber, String email, String city) {
        this(firstName, lastName, age); // constructor chaining
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}