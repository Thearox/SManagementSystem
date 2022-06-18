package za.ac.cput.school_management.Service.lookup.impl;

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.lookup.Address;
import za.ac.cput.school_management.repository.lookup.AddressRepository;


import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class AddressServiceIMPLTest {
    private Address address;
    private AddressRepository repository;

    @Test
    void save() {
        Address save = this.repository.save(this.address);
        System.out.println(save);
        assertNotNull(save);
        assertSame(this.address, save);
    }

    @Test
    void read() {
        Optional<Address> read = this.repository.read(this.address.getUnitNumber());
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertSame(this.address, read.get())
        );
    }

    @Test
    void delete() {
        Address save = this.repository.save(this.address);
        List<Address> addressList = this.repository.findAll();
        assertEquals(1, addressList.size());
        this.repository.delete(save);
    }

    @Test
    void findAll() {
        List<Address> addressList = this.repository.findAll();
        assertEquals(1,addressList.size());
    }
}