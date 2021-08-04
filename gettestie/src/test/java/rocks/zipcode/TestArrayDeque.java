package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayDeque;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestArrayDeque {
    @Test
    public void testAdd(){
        Person john = new Person("John", 1988);
        Person jimmy = new Person("Jimmy", 1989);
        Person tom = new Person("Tom", 1990);
        Address forJohn = new Address("Street","Town","Postal Code");
        ArrayDeque<Person> expected = new ArrayDeque<>();
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
        ArrayDeque<Person> expected = new ArrayDeque<>();
        expected.add(john);
        expected.offerFirst(jimmy);

        assertEquals(true,expected.remove(jimmy));

    }
    @Test
    public void testClearAndEmpty(){
        Person john = new Person("John", 1988);
        Person jimmy = new Person("Jimmy", 1989);
        Person tom = new Person("Tom", 1990);
        Address forJohn = new Address("Street","Town","Postal Code");
        ArrayDeque<Person> expected = new ArrayDeque<>();
        expected.add(john);
        expected.add(jimmy);
        expected.clear();

        assertTrue(expected.isEmpty());

    }
    @Test
    public void testContains(){
        Person john = new Person("John", 1988);
        Person jimmy = new Person("Jimmy", 1989);
        Person tom = new Person("Tom", 1990);
        Address forJohn = new Address("Street","Town","Postal Code");
        ArrayDeque<Person> expected = new ArrayDeque<>();
        expected.add(john);
        expected.add(jimmy);

        assertTrue(expected.contains(john));
    }

    @Test
    public void testPeek(){
        Person john = new Person("John", 1988);
        Person jimmy = new Person("Jimmy", 1989);
        Person tom = new Person("Tom", 1990);
        Address forJohn = new Address("Street","Town","Postal Code");
        ArrayDeque<Person> expected = new ArrayDeque<>();
        expected.add(john);
        expected.add(jimmy);

        assertEquals(john,expected.peek());
    }
    @Test
    public void testPollOnEmpty(){
        Person john = new Person("John", 1988);
        Person jimmy = new Person("Jimmy", 1989);
        Person tom = new Person("Tom", 1990);
        Address forJohn = new Address("Street","Town","Postal Code");
        ArrayDeque<Person> expected = new ArrayDeque<>();
        expected.add(john);
        expected.add(jimmy);

        expected.clear();
        assertEquals(null,expected.poll());
    }
    @Test
    public void testPushAndPop(){
        Person john = new Person("John", 1988);
        Person jimmy = new Person("Jimmy", 1989);
        Person tom = new Person("Tom", 1990);
        Address forJohn = new Address("Street","Town","Postal Code");
        ArrayDeque<Person> expected = new ArrayDeque<>();
        expected.push(john);
        expected.push(tom);

        assertEquals(tom,expected.pop());
    }
    @Test
    public void testSize(){
        Person john = new Person("John", 1988);
        Person jimmy = new Person("Jimmy", 1989);
        Person tom = new Person("Tom", 1990);
        Address forJohn = new Address("Street","Town","Postal Code");
        ArrayDeque<Person> expected = new ArrayDeque<>();
        expected.push(john);
        expected.push(tom);

        assertEquals(2,expected.size());
    }
}
