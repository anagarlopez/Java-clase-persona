package com.ana.dev.models;

public class Person {
    
    public String name;
    private String firstName;
    private String dni;
    private int bornYear;

    public Person(String name, String firstName, String dni, int bornYear) {
        this.name = name;
        this.firstName = firstName;
        this.dni = dni;
        this.bornYear = bornYear;
    }

     
    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getFirstName() {
        return firstName;
    }



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



    public String getDni() {
        return dni;
    }



    public void setDni(String dni) {
        this.dni = dni;
    }



    public int getBornYear() {
        return bornYear;
    }



    public void setBornYear(int bornYear) {
        this.bornYear = bornYear;
    }



    public void render() {
        System.out.println(name);
        System.out.println(firstName);  
        System.out.println(dni); 
        System.out.println(bornYear); 
    }


}
