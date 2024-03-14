package com.example.schooldatabase;

public class Section extends Subject {
    String name;
    Section(String name, Learner[] learners, Teacher classTeacher) {
        super(learners, classTeacher);
        this.name = name;
    }
}
