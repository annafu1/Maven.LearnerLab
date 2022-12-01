package io.zipcoder.interfaces;

public class Person {
    static long id;
    static String name;

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {

    }

    public static Long getId() {
        return id;
    }

    public static void setId(Long id) {
        Person.id = id;
    }


    public long getID() {
        return id;
    }

    public static String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }
}
