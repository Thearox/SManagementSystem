package za.ac.cput.school_management.factory.employee;

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.city.City;
import za.ac.cput.school_management.domain.country.Country;
import za.ac.cput.school_management.domain.employee.EmployeeAddress;
import za.ac.cput.school_management.domain.lookup.Address;
import za.ac.cput.school_management.factory.city.CityFactory;
import za.ac.cput.school_management.factory.country.CountryFactory;
import za.ac.cput.school_management.factory.lookup.AddressFactory;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeAddressFactoryTest {

    @Test
    public void buildWithSuccess() {

        Country country = CountryFactory.createCountry("SA", "South Africa");
        City city = CityFactory.createCity("cpt", "Cape Town", country);
        Address address = AddressFactory.build("01", "Albert", "202", "Lewis", city);
        EmployeeAddress employeeAddress = EmployeeAddressFactory
                .createEmployeeAddress("01", address);
        System.out.println(employeeAddress);
        assertNotNull(employeeAddress);
    }

    @Test
    public void buildWithError() {

        Country country = CountryFactory.createCountry("SA", "South Africa");
        City city = CityFactory.createCity("cpt", "Cape Town", country);
        Address address = AddressFactory.build("01", "Albert", "202", "Lewis", city);
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> EmployeeAddressFactory.createEmployeeAddress("null", address));
        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame("Staff Id is required",exceptionMessage);
    }



}