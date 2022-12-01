package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void implementationTest() {
        //when
        Teacher teacher = (Teacher) (Object) new Instructor();
        //then
        Assert.assertTrue(Instructor instanceof Teacher);
    }

    @Test
    public void inheritanceTest() {
        //when
        Person person = (Person) (Object) new Instructor();
        //then
        Assert.assertTrue(Instructor instanceof Person);
    }

    @Test
    public void teachTest() {

    }

    @Test
    public void lectureTest() {

    }
}
