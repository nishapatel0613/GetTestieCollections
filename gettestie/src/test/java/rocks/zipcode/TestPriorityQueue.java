package rocks.zipcode;

import org.junit.Test;

import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPriorityQueue {
    @Test
    public void testAdd(){
        Person john = new Person("Jhon",1988);
        Person jimmy = new Person("Jimmy",1989);
        Person tom = new Person("Tom",1990);
        john.setAddress("Street","Town","Postal Code");
        PriorityQueue<Person> expected = new PriorityQueue<>();
        expected.add(john);
        expected.add(jimmy);

        assertTrue(expected.add(tom));
    }
    @Test
    public void testClearAndEmpty(){
        Person john = new Person("Jhon",1988);
        Person jimmy = new Person("Jimmy",1989);
        Person tom = new Person("Tom",1990);
        john.setAddress("Street","Town","Postal Code");
        PriorityQueue<Person> expected = new PriorityQueue<>();
        expected.add(john);
        expected.add(jimmy);
        expected.clear();

        assertTrue(expected.isEmpty());
    }
    @Test
    public void testContains(){
        Person john = new Person("Jhon",1988);
        Person jimmy = new Person("Jimmy",1989);
        Person tom = new Person("Tom",1990);
        john.setAddress("Street","Town","Postal Code");
        PriorityQueue<Person> expected = new PriorityQueue<>();
        expected.add(john);
        expected.add(jimmy);

        assertTrue(expected.contains(john));

    }
    @Test
    public void testPeek(){
        Person john = new Person("Jhon",1988);
        Person jimmy = new Person("Jimmy",1989);
        Person tom = new Person("Tom",1990);
        john.setAddress("Street","Town","Postal Code");
        PriorityQueue<Person> expected = new PriorityQueue<>();
        expected.add(john);
        expected.add(jimmy);

        assertEquals(john,expected.peek());
    }
    @Test
    public void testPoll(){
        Person john = new Person("Jhon",1988);
        Person jimmy = new Person("Jimmy",1989);
        Person tom = new Person("Tom",1990);
        john.setAddress("Street","Town","Postal Code");
        PriorityQueue<Person> expected = new PriorityQueue<>();
        expected.add(john);
        expected.add(jimmy);

        assertEquals(john,expected.poll());

    }
    @Test
    public void testSize(){
        Person john = new Person("Jhon",1988);
        Person jimmy = new Person("Jimmy",1989);
        Person tom = new Person("Tom",1990);
        john.setAddress("Street","Town","Postal Code");
        PriorityQueue<Person> expected = new PriorityQueue<>();
        expected.add(john);
        expected.add(jimmy);

        assertEquals(2,expected.size());
    }
    @Test
    public void testRemove(){
        Person john = new Person("Jhon",1988);
        Person jimmy = new Person("Jimmy",1989);
        Person tom = new Person("Tom",1990);
        john.setAddress("Street","Town","Postal Code");
        PriorityQueue<Person> expected = new PriorityQueue<>();
        expected.add(john);
        expected.add(jimmy);

        assertEquals(true,expected.remove(john));
    }
}
