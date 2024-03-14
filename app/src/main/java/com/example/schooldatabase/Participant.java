package com.example.schooldatabase;

public class Participant extends Person {
    public int cardID;
    Participant(String fullName, String phone, int cardID) {
        super(fullName, phone);
        this.cardID = cardID;
    }
    Participant() {}
}
