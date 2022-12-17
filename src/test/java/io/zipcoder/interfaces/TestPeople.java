package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestPeople {
    @Test
    public void addTest() {
        //given
        long givenid= 2358;
        String givenName= "Ying";
        ArrayList<Person> personList= new ArrayList<Person>();
        Person blin = new Person(givenid, givenName);
        int expected=1;
        //when
        People<Person> people=new People<Person>();
        people.addPerson(blin);
        int actual = (int) people.count(personList);
        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeTest() {
        //given
        long givenid= 2328;
        String givenName= "John";
        ArrayList<Person> personList= new ArrayList<Person>();
        Person blin = new Person(givenid, givenName);
        int expected=0;
        //when
        People<Person> people=new People<Person>();
        people.addPerson(blin);
        people.remove(blin);
        int actual = (int) people.count(personList);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void FindByIdTest() {
        //given
        long givenid= 278;
        String givenName= "Sarah";
        Person blin = new Person(givenid, givenName);

        //when
        People<Person> people=new People<Person>();
        people.addPerson(blin);
        Person actual=people.findById(givenid);

        //then
        Assert.assertEquals(blin, actual);
    }
}
