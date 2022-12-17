package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;

public class People<I extends Person> implements Iterable {
    ArrayList<Person> personList = new ArrayList<Person>();
    public void addPerson(Person person) {
        personList.add(person);
    }

    public double count(ArrayList<Person> personList) {
        double numOfPersons = this.personList.size();
        return numOfPersons;
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public void removeById(long id) {
        personList.remove(findById(id));
    }

    public void removeAll() {
        personList.removeAll(personList);
    }

    public Person findById(long givenid) {
        for(Person person : personList) {
            if (person.getID() == Person.id) {
                return person;
            }
        }
        return null;
    }

    public Boolean containsPerson(Person person) {
        for (Person hasPerson : personList) {
            if (hasPerson == person) {
                return true;
            }
        }
        return false;
    }

    public Iterator iterator() {
        return personList.listIterator();
    }

    public Object[] toArray() {
        Person[] person;
        return personList.toArray();
    }
}
