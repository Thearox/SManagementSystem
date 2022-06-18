/*
 *Keallan Saunders 219169357
 * ADP ASSIGNMENT JUNE 2022
 * AddressFactoryTest.java
 * Due Date 18 June 2022 23:59
 * */
package za.ac.cput.school_management.factory.lookup;

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.lookup.Address;

import static org.junit.jupiter.api.Assertions.*;

class AddressFactoryTest {

    @Test
    public void buildWithSuccess() {
        Address address = AddressFactory.build("2", "Lambo", "22", "Bloom Street", "Cape Town");
        System.out.println(address);
        assertNotNull(address);
    }
    @Test
            public void buildWithError(){
            Exception exception = assertThrows(IllegalArgumentException.class,
                    () -> AddressFactory.build("", "", "", "", ""));

            String excepMessage = exception.getMessage();
            System.out.println(excepMessage);
            assertSame("Unit Number Required!", excepMessage);
        }

}
