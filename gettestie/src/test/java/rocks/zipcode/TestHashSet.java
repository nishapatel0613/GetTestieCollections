package rocks.zipcode;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestHashSet {
    @Test
    public void testAdd(){
        HashSet<Person> set = new HashSet<>();
        Person john = new Person("John", 1988);
        john.setAddress("Street","Town","Postal Code");
        assertTrue(set.add(john));
    }
    @Test
    public void testRemove(){
        HashSet<Person> set = new HashSet<>();
        Person john = new Person("John", 1988);
        john.setAddress("Street","Town","Postal Code");
        set.remove(john);
        assertTrue(set.isEmpty());
    }
    @Test
    public void testClearAndEmpty(){
        HashSet<Person> set = new HashSet<>();
        Person john = new Person("John", 1988);
        john.setAddress("Street","Town","Postal Code");
        set.clear();

        assertTrue(set.isEmpty());
    }
    @Test
    public void testSize(){
        HashSet<Person> set = new HashSet<>();
        Person john = new Person("John", 1988);
        Person jimmy = new Person("Jimmy", 1989);
        Person tom = new Person("Tom", 1990);
        john.setAddress("Street","Town","Postal Code");
        jimmy.setAddress("Street1","Town1","Postal Code1");
        tom.setAddress("Street2","Town2","Postal Code2");
        set.add(john);
        set.add(jimmy);
        set.add(tom);

        int actual = set.size();

        assertEquals(3,actual);
    }
    @Test
    public void testContains(){
        HashSet<Person> set = new HashSet<>();
        Person john = new Person("John", 1988);
        Person jimmy = new Person("Jimmy", 1989);
        Person tom = new Person("Tom", 1990);
        john.setAddress("Street","Town","Postal Code");
        jimmy.setAddress("Street1","Town1","Postal Code1");
        tom.setAddress("Street2","Town2","Postal Code2");
        set.add(john);
        set.add(jimmy);
        set.add(tom);

        Boolean result = set.contains(jimmy);
        assertTrue(result);
    }
    @Test
    public void testClonesAndEquals(){
        HashSet<Person> set = new HashSet<>();
        Person john = new Person("John", 1988);
        Person jimmy = new Person("Jimmy", 1989);
        Person tom = new Person("Tom", 1990);
        john.setAddress("Street","Town","Postal Code");
        jimmy.setAddress("Street1","Town1","Postal Code1");
        tom.setAddress("Street2","Town2","Postal Code2");
        set.add(john);
        set.add(jimmy);
        set.add(tom);

        Boolean result = set.contains(jimmy);
        HashSet<Person> personHashSet = (HashSet<Person>) set.clone();

        assertTrue(personHashSet.equals(set));

    }
}
