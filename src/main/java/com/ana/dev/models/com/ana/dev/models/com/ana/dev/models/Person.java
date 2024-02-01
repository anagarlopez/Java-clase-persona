package com.ana.dev.models;

public class Person {
    
    public String name;
    public String firstName;
    private String dni;
    private int bornYear;
    public String birthCountry;
    public char gender;

    public Person(String birthCountry, char gender) {
        this.birthCountry = birthCountry;
        this.gender = gender;
    }


    public Person(String name, String firstName, String dni, int bornYear) {
        this.name = name;
        this.firstName = firstName;
        this.dni = dni;
        this.bornYear = bornYear;
    }
    


    public void render() {
        System.out.println(name);
        System.out.println(firstName);  
        System.out.println(dni); 
        System.out.println(bornYear); 
        System.out.println(birthCountry); 
        System.out.println(gender); 
    }


}
