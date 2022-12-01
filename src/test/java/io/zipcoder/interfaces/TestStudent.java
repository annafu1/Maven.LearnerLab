package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void implementationTest() {
        //when
        learner student = (learner)(Object) new Student();
        //then
        Assert.assertTrue(student instanceof learner);

    }

    @Test
    public void inheritanceTest() {
        //when
        Person student = (Person)(Object) new Student();
        //then
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void learnTest() {
        double expectedStudyTime = 30;
        double numberOfHours = 3;
        Student student = new Student();
        student.learn(numberOfHours);
        Assert.assertEquals(expectedStudyTime, student.totalStudyTime);
    }

}
