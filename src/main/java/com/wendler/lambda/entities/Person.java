package com.wendler.lambda.entities;

public class Person {

    private String firstName;
    private String lastName;
    private String cpf;

    public Person(String firstName, String lastName, String cpf) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.cpf = cpf;
    }

    public Person() {

    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getCpf() {

        return cpf;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }

    @Override
    public String toString() {

        return firstName + ' ' + lastName;
    }
}
