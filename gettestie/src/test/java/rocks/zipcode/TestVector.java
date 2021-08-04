package rocks.zipcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestVector {
    Vector<Person> vector = new Vector<>();

    @Test
    public void TestVectorAdd(){
        Person john = new Person("Jhon",1980);
        Person james = new Person("James",1990);
        Person joe = new Person("Joe", 1989);
        james.setAddress("Street 1", "Town 2","PostalCode");

        assertTrue(vector.add(james));
    }
    @Test
    public void TestVectorRemove(){
        Person john = new Person("Jhon",1980);
        Person james = new Person("James",1990);
        Person joe = new Person("Joe", 1989);
        james.setAddress("Street 1", "Town 2","PostalCode");

        vector.add(john);
        vector.add(james);
        vector.add(joe);

        Person actual = vector.remove(0);
        assertEquals(john,actual);
    }
    @Test
    public void TestVectorIsEmpty(){
        Person john = new Person("Jhon",1980);
        Person james = new Person("James",1990);
        Person joe = new Person("Joe", 1989);
        james.setAddress("Street 1", "Town 2","PostalCode");

        vector.add(john);
        vector.add(james);
        vector.add(joe);
        vector.clear();

        assertTrue(vector.isEmpty());
    }
    @Test
    public void TestVectorGet(){
        Person john = new Person("Jhon",1980);
        Person james = new Person("James",1990);
        Person joe = new Person("Joe", 1989);
        james.setAddress("Street 1", "Town 2","PostalCode");

        vector.add(john);
        vector.add(james);
        vector.add(joe);
        Person actual = vector.get(1);

        assertEquals(james,actual);

    }
    @Test
    public void TestVectorSet(){
        Person john = new Person("Jhon",1980);
        Person james = new Person("James",1990);
        Person joe = new Person("Joe", 1989);
        james.setAddress("Street 1", "Town 2","PostalCode");

        vector.add(john);
        vector.add(james);

        assertEquals(james,vector.set(1,joe));
    }

}
