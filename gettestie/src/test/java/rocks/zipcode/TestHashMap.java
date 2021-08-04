package rocks.zipcode;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class TestHashMap {
    @Test
    public void testPut(){
        HashMap<Person,Address> map = new HashMap<>();
        Person john = new Person("John", 1988);
        Person jimmy = new Person("Jimmy", 1989);
        Person tom = new Person("Tom", 1990);
        Address forJohn = new Address("Street","Town","Postal Code");
        Address forJimmy = new Address("Street1","Town1","Postal Code1");
        Address forTom = new Address("Street2","Town2","Postal Code2");
        map.put(john,forJohn);
        map.put(jimmy,forJimmy);
        map.put(tom,forTom);

        assertTrue(map.containsKey(john));
    }
    @Test
    public void testRemove(){
        HashMap<Person,Address> map = new HashMap<>();
        Person john = new Person("John", 1988);
        Person jimmy = new Person("Jimmy", 1989);
        Person tom = new Person("Tom", 1990);
        Address forJohn = new Address("Street","Town","Postal Code");
        Address forJimmy = new Address("Street1","Town1","Postal Code1");
        Address forTom = new Address("Street2","Town2","Postal Code2");
        map.put(john,forJohn);
        map.put(jimmy,forJimmy);
        map.put(tom,forTom);

        assertTrue(map.remove(john,forJohn));
        assertFalse(map.containsKey(john));

    }
    @Test
    public void testIsEmpty(){
        HashMap<Person,Address> map = new HashMap<>();
        Person john = new Person("John", 1988);
        Person jimmy = new Person("Jimmy", 1989);
        Person tom = new Person("Tom", 1990);
        Address forJohn = new Address("Street","Town","Postal Code");
        Address forJimmy = new Address("Street1","Town1","Postal Code1");
        Address forTom = new Address("Street2","Town2","Postal Code2");
        map.put(john,forJohn);
        map.put(jimmy,forJimmy);
        map.put(tom,forTom);
        map.clear();
        assertTrue(map.isEmpty());
    }
    @Test
    public void testGetKey(){
        HashMap<Person,Address> map = new HashMap<>();
        Person john = new Person("John", 1988);
        Person jimmy = new Person("Jimmy", 1989);
        Person tom = new Person("Tom", 1990);
        Address forJohn = new Address("Street","Town","Postal Code");
        Address forJimmy = new Address("Street1","Town1","Postal Code1");
        Address forTom = new Address("Street2","Town2","Postal Code2");
        map.put(john,forJohn);
        map.put(jimmy,forJimmy);
        map.put(tom,forTom);
        Address actual = map.get(john);

        assertEquals(forJohn,actual);
    }
    @Test
    public void testReplace(){
        HashMap<Person,Address> map = new HashMap<>();
        Person john = new Person("John", 1988);
        Address forJohn = new Address("Street","Town","Postal Code");
        Person jimmy = new Person("Jimmy", 1989);
        Address forJimmy = new Address("Street1","Town1","Postal Code1");
        map.put(john,forJohn);

        assertTrue(map.replace(john,forJohn,forJimmy));

    }
}
