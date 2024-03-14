package com.example.schooldatabase;

public class Employee extends Participant{
    public String position;
    Employee(String fullName, String phone, int cardID, String position) {
        super(fullName, phone, cardID);
        this.position = position;
    }
}
