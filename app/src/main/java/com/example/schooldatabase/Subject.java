package com.example.schooldatabase;

public class Subject {
    Learner [] learners;
    Teacher classTeacher;
    Subject(Learner[] learners, Teacher classTeacher) {
        this.learners = learners;
        this.classTeacher = classTeacher;
    }
    Subject() {}

    public Learner[] getLearners() {
        return learners;
    }
    public Parent[][] getParents() {
        Parent[][] out = new Parent[learners.length][2];
        for (int i = 0; i < learners.length; i++){
            out[i][0] = learners[i].parents[0];
            out[i][1] = learners[i].parents[1];
        }
        return out;
    }
}
