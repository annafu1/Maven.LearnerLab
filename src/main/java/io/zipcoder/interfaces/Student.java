package io.zipcoder.interfaces;

public class Student {

    public double totalStudyTime;

    public class Student extends Person implements learner {
        double totalStudyTime;

        public Student (long id, String name, double totalStudyTime) {
            super(id, name);
            this.totalStudyTime = totalStudyTime;
        }

        public void setTotalStudyTime (double totalStudyTime) {
            this.totalStudyTime = totalStudyTime;
        }

        public double getTotalStudyTime() {
            return totalStudyTime;
        }

    }
    public void learn(double numberOfHours) {
        this.totalStudyTime = numberOfHours;
    }

}
