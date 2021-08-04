package rocks.zipcode;

import org.junit.Test;
//import  gettestie.src.main.java.rocks.zipcode.Address;


import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTreeMap {

    TreeMap<Person,Address> personAddressTreeMap = new TreeMap<Person,Address>();
    @Test
    public void testTreeMapPut(){
        Person john = new Person("John",1988);
        Person jimmy = new Person("Jimmy",1989);
        Person tom = new Person("Tom",1990);

        Address forJohn = new Address("Street 101", "Town","PostalCode","Country");
        Address forJimmy = new Address("Street 102", "Town1","PostalCode1","Country1");
        Address forTom = new Address("Street 103", "Town2","PostalCode2","Country2");

        personAddressTreeMap.put(john,forJohn);
        personAddressTreeMap.put(jimmy,forJimmy);
        personAddressTreeMap.put(tom,forTom);

        assertTrue(personAddressTreeMap.containsKey(john));

    }
    @Test
    public void testTreeMapGetValue(){
        Person john = new Person("John",1988);
        Person jimmy = new Person("Jimmy",1989);
        Person tom = new Person("Tom",1990);

        Address forJohn = new Address("Street 101", "Town","PostalCode","Country");
        Address forJimmy = new Address("Street 102", "Town1","PostalCode1","Country1");
        Address forTom = new Address("Street 103", "Town2","PostalCode2","Country2");

        personAddressTreeMap.put(john,forJohn);
        personAddressTreeMap.put(jimmy,forJimmy);
        personAddressTreeMap.put(tom,forTom);

        assertEquals(forJohn,personAddressTreeMap.get(john));

    }
    @Test
    public void testTreeMapFirstKey(){
        Person john = new Person("John",1988);
        Person jimmy = new Person("Jimmy",1989);
        Person tom = new Person("Tom",1990);

        Address forJohn = new Address("Street 101", "Town","PostalCode","Country");
        Address forJimmy = new Address("Street 102", "Town1","PostalCode1","Country1");
        Address forTom = new Address("Street 103", "Town2","PostalCode2","Country2");

        personAddressTreeMap.put(john,forJohn);
        personAddressTreeMap.put(jimmy,forJimmy);
        personAddressTreeMap.put(tom,forTom);

        assertEquals(john,personAddressTreeMap.firstKey());
    }
    @Test
    public void testTreeMapSize(){
        Person john = new Person("John",1988);
        Person jimmy = new Person("Jimmy",1989);
        Person tom = new Person("Tom",1990);

        Address forJohn = new Address("Street 101", "Town","PostalCode","Country");
        Address forJimmy = new Address("Street 102", "Town1","PostalCode1","Country1");
        Address forTom = new Address("Street 103", "Town2","PostalCode2","Country2");

        personAddressTreeMap.put(john,forJohn);
        personAddressTreeMap.put(jimmy,forJimmy);
        personAddressTreeMap.put(tom,forTom);

        assertEquals(3,personAddressTreeMap.size());

    }
    @Test
    public void testTreeMapReplace(){
        Person john = new Person("John",1988);
        Person jimmy = new Person("Jimmy",1989);
        Person tom = new Person("Tom",1990);

        Address forJohn = new Address("Street 101", "Town","PostalCode","Country");
        Address forJimmy = new Address("Street 102", "Town1","PostalCode1","Country1");
        Address forTom = new Address("Street 103", "Town2","PostalCode2","Country2");

        personAddressTreeMap.put(john,forJohn);
        personAddressTreeMap.put(jimmy,forJimmy);
        //personAddressTreeMap.put(tom,forTom);

        assertEquals(true,personAddressTreeMap.replace(john,forJohn,forTom));
    }
}
