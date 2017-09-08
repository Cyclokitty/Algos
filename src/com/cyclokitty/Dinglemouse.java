package com.cyclokitty;

public class Dinglemouse {

    private String firstName;
    private String lastName;

    public Dinglemouse(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        if (firstName.length() == 0) {
            return lastName;
        }
        if (lastName.length() == 0) {
            return firstName;
        }
        return firstName + " " + lastName;
    }
}
