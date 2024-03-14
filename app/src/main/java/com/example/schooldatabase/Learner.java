package com.example.schooldatabase;

public class Learner extends Participant {
    Parent[] parents;
    Learner(String fullName, String phone, int cardID, Parent[] parents) {
        super(fullName, phone, cardID);
        this.parents = parents;
    }
}
