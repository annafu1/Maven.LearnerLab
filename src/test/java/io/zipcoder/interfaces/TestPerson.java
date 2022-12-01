package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void TestConstructor() {
        //given
        String expectedName = "Sarah";
        Long expectedId = 2134L;
        //when
        String actualName = Person.getName();
        Long actualId = Person.getId();
        //then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void SetNameTest() {
        //given
        Person person = new Person();
        String expectedName = "Sarah";
        //when
        String actualName = person.setName(expectedName);
        //then
        Assert.assertEquals(expectedName, actualName);
    }

}
