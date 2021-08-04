package rocks.zipcode;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLinkedList {
    @Test
    public void testAdd(){
        Person john = new Person("John", 1988);
        Person jimmy = new Person("Jimmy", 1989);
        Person tom = new Person("Tom", 1990);
        john.setAddress("Street","Town","Postal Code");
        LinkedList<Person> expected = new LinkedList<>();
        expected.add(john);
        expected.add(jimmy);

        assertTrue(expected.add(tom));
    }
    @Test
    public void testRemove(){
        Person john = new Person("John", 1988);
        Person jimmy = new Person("Jimmy", 1989);
        Person tom = new Person("Tom", 1990);
        Address forJohn = new Address("Street","Town","Postal Code");
        LinkedList<Person> expected = new LinkedList<>();
        expected.add(john);
        expected.add(jimmy);
        expected.add(tom);

        assertEquals(john,expected.remove());
    }
    @Test
    public void testRemoveFirst(){
        Person john = new Person("John", 1988);
        Person jimmy = new Person("Jimmy", 1989);
        Person tom = new Person("Tom", 1990);
        Address forJohn = new Address("Street","Town","Postal Code");
        LinkedList<Person> expected = new LinkedList<>();
        expected.add(john);
        expected.add(jimmy);
        expected.add(tom);

        assertEquals(john,expected.removeFirst());

    }
    @Test
    public void testRemoveLast(){
        Person john = new Person("John", 1988);
        Person jimmy = new Person("Jimmy", 1989);
        Person tom = new Person("Tom", 1990);
        Address forJohn = new Address("Street","Town","Postal Code");
        LinkedList<Person> expected = new LinkedList<>();
        expected.add(john);
        expected.add(jimmy);
        expected.add(tom);

        assertEquals(tom,expected.removeLast());
    }
    @Test
    public void testClearAndEmpty(){
        Person john = new Person("John", 1988);
        Person jimmy = new Person("Jimmy", 1989);
        Person tom = new Person("Tom", 1990);
        Address forJohn = new Address("Street","Town","Postal Code");
        LinkedList<Person> expected = new LinkedList<>();
        expected.add(john);
        expected.add(jimmy);
        expected.add(tom);
        expected.clear();

        assertTrue(expected.isEmpty());
    }
    @Test
    public void testPeek(){
        Person john = new Person("John", 1988);
        Person jimmy = new Person("Jimmy", 1989);
        Person tom = new Person("Tom", 1990);
        Address forJohn = new Address("Street","Town","Postal Code");
        LinkedList<Person> expected = new LinkedList<>();
        expected.add(john);
        expected.add(jimmy);
        expected.add(tom);

        assertEquals(john,expected.peek());
    }
    @Test
    public void testSet(){
        Person john = new Person("John", 1988);
        Person jimmy = new Person("Jimmy", 1989);
        Person tom = new Person("Tom", 1990);
        Address forJohn = new Address("Street","Town","Postal Code");
        Person joe = new Person("Joe",1992);
        LinkedList<Person> expected = new LinkedList<>();
        expected.add(john);
        expected.add(jimmy);
        expected.add(tom);

        assertEquals(jimmy,expected.set(1,joe));
    }
    @Test
    public void testSize(){
        Person john = new Person("John", 1988);
        Person jimmy = new Person("Jimmy", 1989);
        Person tom = new Person("Tom", 1990);
        Address forJohn = new Address("Street","Town","Postal Code");
        LinkedList<Person> expected = new LinkedList<>();
        expected.add(john);
        expected.add(jimmy);
        expected.add(tom);
        assertEquals(3,expected.size());
    }
    @Test
    public void testPush(){
        Person john = new Person("John", 1988);
        Person jimmy = new Person("Jimmy", 1989);
        Person tom = new Person("Tom", 1990);
        Address forJohn = new Address("Street","Town","Postal Code");
        LinkedList<Person> expected = new LinkedList<>();
        expected.add(john);
        expected.add(jimmy);
        expected.add(tom);

        assertEquals(john,expected.pop());
    }
}
