/*
 *Keallan Saunders 219169357
 * ADP ASSIGNMENT JUNE 2022
 * AddressFactoryTest.java
 * Due Date 18 June 2022 23:59
 * */
package za.ac.cput.school_management.factory.lookup;

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.city.City;
import za.ac.cput.school_management.domain.country.Country;
import za.ac.cput.school_management.domain.lookup.Address;
import za.ac.cput.school_management.factory.city.CityFactory;
import za.ac.cput.school_management.factory.country.CountryFactory;

import static org.junit.jupiter.api.Assertions.*;

class AddressFactoryTest {

    @Test
    public void buildWithSuccess() {
        Country country = CountryFactory.createCountry("sa", "South Africa");
        City city = CityFactory.createCity("cpt", "Cape Town", country);
        Address address = AddressFactory.build("2", "Lambo", "22", "Bloom Street", city);
        System.out.println(address);
        assertNotNull(address);
    }
    @Test
            public void buildWithError(){

        Country country = CountryFactory.createCountry("sa", "South Africa");
        City city = CityFactory.createCity("cpt", "Cape Town", country);
            Exception exception = assertThrows(IllegalArgumentException.class,
                    () -> AddressFactory.build("", "", "", "", city));

            String excepMessage = exception.getMessage();
            System.out.println(excepMessage);
            assertSame("Unit Number Required!", excepMessage);
        }

}
