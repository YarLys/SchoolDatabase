package com.example.schooldatabase;

public class Teacher extends Participant {
    String position, qualification;
    Teacher(String fullName, String phone, int cardID, String position, String qualification) {
        super(fullName, phone, cardID);
        this.position = position;
        this.qualification = qualification;
    }
}
