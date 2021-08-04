package rocks.zipcode;

import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestIterator {
    @Test
    public void testIteratorTest(){
        Person john = new Person("Jhon",1988);
        Person jimmy = new Person("Jimmy",1989);
        Person tom = new Person("Tom",1990);
        john.setAddress("Street","Town","Postal Code");
        LinkedList<Person> expected = new LinkedList<>();
        expected.add(john);
        expected.add(jimmy);
        Iterator iterator = expected.iterator();
        int size = expected.size();
        int count = 0;
        while (iterator.hasNext()){
            if(iterator.next() == john){
                System.out.println("Hello");
            }
            count++;
        }
        assertEquals(2,count);
    }
    @Test
    public void testIteratorNext(){
        Person john = new Person("Jhon",1988);
        Person jimmy = new Person("Jimmy",1989);
        Person tom = new Person("Tom",1990);
        john.setAddress("Street","Town","Postal Code");
        LinkedList<Person> expected = new LinkedList<>();
        expected.add(john);
        expected.add(jimmy);
        Iterator iterator = expected.iterator();
        int size = expected.size();
        int count = 0;
        while (iterator.hasNext()){
            if(iterator.next() == john){
            count++;
        }
        assertEquals(1,count);
        }

    }
}
