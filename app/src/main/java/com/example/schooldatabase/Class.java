package com.example.schooldatabase;

public class Class extends Subject {
    public String number;
    Class(String number, Learner[] learners, Teacher classTeacher) {
        super(learners, classTeacher);
        this.number = number;
    }
}
