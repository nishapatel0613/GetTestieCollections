package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestComparable {

    @Test
    public void testReverse(){
        Person john = new Person("Jhon",1988);
        Person jimmy = new Person("Jimmy",1989);
        Person tom = new Person("Tom",1990);
        john.setAddress("Street","Town","Postal Code");
        List<Person> list = new ArrayList<>();
        list.add(john);
        list.add(jimmy);
        list.add(tom);

        Collections.sort(list);
        Collections.reverse(list);
        Person[] expected = {john,jimmy,tom};
        Person[] actual = list.toArray(new Person[list.size()]);

        assertEquals(expected,actual);
    }
    @Test
    public void testSort(){
        Person john = new Person("Jhon",1988);
        Person jimmy = new Person("Jimmy",1989);
        Person tom = new Person("Tom",1990);
        john.setAddress("Street","Town","Postal Code");
        List<Person> list = new ArrayList<>();
        list.add(john);
        list.add(jimmy);
        list.add(tom);

        Collections.sort(list);

        Person[] expected = {john,jimmy,tom};
        Person[] actual = list.toArray(new Person[list.size()]);

        assertEquals(expected,actual);
    }
}
