/*
 * John Lawless
 * g00351835@gmit.ie
 *
 * Maven Project
 * In class practice test
 * The object is to design, through test driven design,
 * a passenger class.
 * Test that the passengers title is valid
 * Test name, id and phone number are long enough
 * Test the passenger is old enough to travel alone
 * Produce a report in jacoco
 * */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PassengerTest {

    Passenger passenger;

    @DisplayName("***********Testing creation of passenger Object title Mrs***********")
    @Test
    void testConstructorPassengerTitleMrs(){
        passenger = new Passenger("Mrs", "John Lawless", "JohnL123456", "0860497289", 49);
        assertEquals("Mrs", passenger.getTitle());
    }

    @DisplayName("***********Testing creation of passenger Object title Ms***********")
    @Test
    void testConstructorPassengerTitleMs(){
        passenger = new Passenger("Ms", "John Lawless", "JohnL123456", "0860497289", 49);
        assertEquals("Ms", passenger.getTitle());
    }

    @DisplayName("***********Testing creation of passenger Object title Mr***********")
    @Test
    void testConstructorPassengerTitleMr(){
        passenger = new Passenger("Mr", "John Lawless", "JohnL123456", "0860497289", 49);
        assertEquals("Mr", passenger.getTitle());
    }



    @DisplayName("***********Testing creation of passenger Object no title ***********")
    @Test
    void testConstructorPassengerWrongTitle(){
        final String invalid = "Title not valid";
        Exception title = assertThrows(IllegalArgumentException.class,()-> new Passenger("M", "John Lawless", "JohnL123456", "0860497289", 49));
        assertEquals(invalid, title.getMessage());
    }

    @DisplayName("***********Testing creation of passenger Object name ***********")
    @Test
    void testConstructorPassengername(){
        passenger = new Passenger("Mr", "John Lawless", "JohnL123456", "0860497289", 49);
        assertEquals("John Lawless", passenger.getName());
    }

    @DisplayName("***********Testing creation of passenger Object name not long enough ***********")
    @Test
    void testConstructorPassengerNameNotLongEnough(){
        final String invalid = "Name not long enough";
        Exception name = assertThrows(IllegalArgumentException.class,()-> new Passenger("Mr", "Jo", "JohnL123456", "0860497289", 49));
        assertEquals(invalid, name.getMessage());
    }

    @DisplayName("***********Testing creation of passenger Object id ***********")
    @Test
    void testConstructorPassengerId(){
        passenger = new Passenger("Mr", "John Lawless", "JohnL123456", "0860497289", 49);
        assertEquals("JohnL123456", passenger.getId());
    }

    @DisplayName("***********Testing creation of passenger Object id not long enough ***********")
    @Test
    void testConstructorPassengerIdNotLongEnough(){
        final String invalid = "Id not long enough";
        Exception id = assertThrows(IllegalArgumentException.class,()-> new Passenger("Mr", "John Lawless", "JohnL12", "0860497289", 49));
        assertEquals(invalid, id.getMessage());
    }

    @DisplayName("***********Testing creation of passenger Object Phone Number ***********")
    @Test
    void testConstructorPassengerPhone(){
        passenger = new Passenger("Mr", "John Lawless", "JohnL123456", "0860497289", 49);
        assertEquals("0860497289", passenger.getPhone());
    }

    @DisplayName("***********Testing creation of passenger Object Phone Number not long enough ***********")
    @Test
    void testConstructorPassengerPhoneNotLongEnough(){
        final String invalid = "Phone Number not long enough";
        Exception PhoneNumberNotLongEnough = assertThrows(IllegalArgumentException.class,()-> new Passenger("Mr", "John Lawless", "JohnL123456", "086049", 49));
        assertEquals(invalid, PhoneNumberNotLongEnough.getMessage());
    }

    @DisplayName("***********Testing creation of passenger Object Age ***********")
    @Test
    void testConstructorPassengerage(){
        passenger = new Passenger("Mr", "John Lawless", "JohnL123456", "0860497289", 49);
        assertEquals(49, passenger.getAge());
    }

    @DisplayName("***********Testing creation of passenger Object Not old enough ***********")
    @Test
    void testConstructorPassengerNotOverSixteen(){
        final String invalid = "You are too young to fly alone";
        Exception age =assertThrows(IllegalArgumentException.class,()-> new Passenger("Mr", "John Lawless", "JohnL123456", "0860497289", 12));
        assertEquals(invalid, age.getMessage());
    }



}
