package rocks.zipcode;

import org.junit.Test;

import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTreeSet {

    @Test
    public void testTreeSetAdd(){
        Person john = new Person("Jhon",1988);
        Person jimmy = new Person("Jimmy",1989);
        Person tom = new Person("Tom",1990);
        john.setAddress("Street","Town","Postal Code");

        TreeSet<Person> expected = new TreeSet<>();
        expected.add(john);
        expected.add(jimmy);


        assertTrue(expected.add(tom));
    }
    @Test
    public void testTreeSetRemove(){
        Person john = new Person("Jhon",1988);
        Person jimmy = new Person("Jimmy",1989);
        Person tom = new Person("Tom",1990);
        john.setAddress("Street","Town","Postal Code");

        TreeSet<Person> expected = new TreeSet<>();
        expected.add(john);
        expected.add(jimmy);

        assertTrue(expected.remove(john));
    }
    @Test
    public void testTreeSetSize(){
        Person john = new Person("Jhon",1988);
        Person jimmy = new Person("Jimmy",1989);
        Person tom = new Person("Tom",1990);
        john.setAddress("Street","Town","Postal Code");

        TreeSet<Person> expected = new TreeSet<>();
        expected.add(john);
        expected.add(jimmy);

        assertEquals(2,expected.size());
    }
    @Test
    public void testTreeSetClearAndEmpty(){
        Person john = new Person("Jhon",1988);
        Person jimmy = new Person("Jimmy",1989);
        Person tom = new Person("Tom",1990);
        john.setAddress("Street","Town","Postal Code");

        TreeSet<Person> expected = new TreeSet<>();
        expected.add(john);
        expected.add(jimmy);
        expected.clear();

        assertTrue(expected.isEmpty());
    }
    @Test
    public void testTreeSetLast(){
        Person john = new Person("Jhon",1988);
        Person jimmy = new Person("Jimmy",1989);
        Person tom = new Person("Tom",1990);
        john.setAddress("Street","Town","Postal Code");

        TreeSet<Person> expected = new TreeSet<>();
        expected.add(john);
        expected.add(jimmy);

        assertEquals(jimmy,expected.last());


    }

}
