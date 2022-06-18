/*
* *Keallan Saunders 219169357
 * ADP ASSIGNMENT JUNE 2022
 * AddressServiceIMPLTest.java
 * Due Date 18 June 2022 23:59*/
package za.ac.cput.school_management.Service.lookup.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.Service.lookup.AddressService;
import za.ac.cput.school_management.domain.lookup.Address;
import za.ac.cput.school_management.factory.employee.EmployeeAddressFactory;
import za.ac.cput.school_management.factory.lookup.AddressFactory;
import za.ac.cput.school_management.repository.lookup.AddressRepository;


import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class AddressServiceIMPLTest {
    private Address address;
    private AddressRepository repository;
    private AddressService service;

    @BeforeEach
    void setUp(){
        this.address = AddressFactory.build("test_un","test_cn","test-sn","test-sname", address.getCity());
        this.service = AddressServiceIMPL.getAddressService();
        Address saved = this.service.save(this.address);
        assertAll(
                () -> assertNotNull(saved),
                () -> assertEquals(this.address, saved)
                );
    }

    @AfterEach
    void tearDown(){this.service.delete(this.address.getUnitNumber());}

    @Test
    void save() {
        Address save = this.service.save(this.address);
        System.out.println(save);
        assertNotNull(save);
        assertSame(this.address, save);
    }

    @Test
    void read() {
        Optional<Address> read = Optional.ofNullable(this.service.read(this.address.getUnitNumber()));
        System.out.println(read);/*read(this.address.getUnitNumber());*/
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertSame(this.address, read.get())
        );
    }

    @Test
    void delete() {
        Address save = this.service.save(this.address);
        List<Address> addressList = this.service.findAll();
        assertEquals(1, addressList.size());
        this.service.delete(String.valueOf(save));
    }

    @Test
    void findAll() {
        List<Address> addressList = this.repository.findAll();
        assertEquals(1,addressList.size());
    }
}