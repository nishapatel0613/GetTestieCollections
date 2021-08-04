package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestArrayList {
    @Test
    public void testAdd(){
        Person john = new Person("John", 1988);
        Person jimmy = new Person("Jimmy", 1989);
        Person tom = new Person("Tom", 1990);
        Person[] johnAndJimmy = {john,jimmy};
        ArrayList<Person> actual = new ArrayList<>(Arrays.asList(johnAndJimmy));
        actual.add(tom);
        Person[] all = {john,jimmy,tom};
        ArrayList<Person> expected = new ArrayList<>(Arrays.asList(all));

        assertEquals(expected,actual);
    }
    @Test
    public void testRemove(){
        Person john = new Person("John", 1988);
        Person jimmy = new Person("Jimmy", 1989);
        Person tom = new Person("Tom", 1990);
        Person[] johnAndJimmytom = {john,jimmy,tom};
        ArrayList<Person> actual = new ArrayList<>(Arrays.asList(johnAndJimmytom));
        actual.remove(tom);
        Person[] all = {john,jimmy};
        ArrayList<Person> expected = new ArrayList<>(Arrays.asList(all));

        assertEquals(expected,actual);
    }
    @Test
    public void testClearAndEmpty(){
        Person john = new Person("John", 1988);
        Person jimmy = new Person("Jimmy", 1989);
        Person tom = new Person("Tom", 1990);
        Person[] johnAndJimmytom = {john,jimmy,tom};
        ArrayList<Person> actual = new ArrayList<>(Arrays.asList(johnAndJimmytom));
        actual.clear();
        assertTrue(actual.isEmpty());

    }
    @Test
    public void testIndexOf(){
        Person john = new Person("John", 1988);
        Person jimmy = new Person("Jimmy", 1989);
        Person tom = new Person("Tom", 1990);
        Person[] johnAndJimmytom = {john,jimmy,tom};
        ArrayList<Person> actual = new ArrayList<>(Arrays.asList(johnAndJimmytom));

        int expected = 0;
        assertEquals(expected,actual.indexOf(john));
    }
    @Test
    public void testGet(){
        Person john = new Person("John", 1988);
        Person jimmy = new Person("Jimmy", 1989);
        Person tom = new Person("Tom", 1990);
        Person[] johnAndJimmytom = {john,jimmy,tom};
        ArrayList<Person> actual = new ArrayList<>(Arrays.asList(johnAndJimmytom));

        assertEquals(john,actual.get(0));
    }
    @Test
    public void testSet(){
        Person john = new Person("John", 1988);
        Person jimmy = new Person("Jimmy", 1989);
        Person tom = new Person("Tom", 1990);
        Person[] johnAndJimmytom = {john,jimmy,tom};
        Person modified = new Person("Joe",1991);
        ArrayList<Person> actual = new ArrayList<>(Arrays.asList(johnAndJimmytom));
        actual.set(2,modified);

        ArrayList<Person> expected = (ArrayList<Person>) actual.clone();
        assertEquals(john,actual.get(0));
    }
}
