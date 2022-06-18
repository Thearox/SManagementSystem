/*
 *Keallan Saunders 219169357
 * ADP ASSIGNMENT JUNE 2022
 * AddressFactory.java
 * Due Date 18 June 2022 23:59
 * */
package za.ac.cput.school_management.factory.lookup;
import za.ac.cput.school_management.domain.city.City;
import za.ac.cput.school_management.domain.lookup.Address;
import za.ac.cput.school_management.helper.StringHelper;
public class AddressFactory {
    public static Address build(String unitNumber,String complexName, String streetNumber, String streetName, City city)
    {
        if (unitNumber == null || unitNumber.isEmpty())
            throw new IllegalArgumentException("A Unit Number must be put in");

        Address Address = new Address.Builder()
                .unitNumber(unitNumber).complexName(complexName).streetNumber(streetNumber).streetName(streetName).city(city).build();
        return Address;
    }
    /*return new Address.Builder().unitNumber(unitNumber).complexName(complexName)
                .streetNumber(streetNumber).streetName(streetName).City(city).build();*/
    }
