/*
 *Keallan Saunders 219169357
 * ADP ASSIGNMENT JUNE 2022
 * AddressServiceIMPL.java
 * Due Date 18 June 2022 23:59
 * */
package za.ac.cput.school_management.Service.lookup.impl;
import za.ac.cput.school_management.Service.lookup.AddressService;
import za.ac.cput.school_management.domain.lookup.Address;
import za.ac.cput.school_management.repository.lookup.impl.AddressRepositoryIMPL;

import java.util.List;

public class AddressServiceIMPL implements AddressService {
    private static AddressService addressService ;
    private AddressRepositoryIMPL ADDRESS_REPOSITORY;

    private AddressServiceIMPL(){this.ADDRESS_REPOSITORY = AddressRepositoryIMPL.getAddressList();}

    public static AddressServiceIMPL getAddressService(){
        if(addressService == null) addressService = new AddressServiceIMPL();
        return (AddressServiceIMPL) addressService;
    }
    @Override
    public Address create(Address address){
        return this.ADDRESS_REPOSITORY.create(address);
    }
    @Override
    public Address read(String a){
        return this.ADDRESS_REPOSITORY.read(a);/*stream().filter(g -> g.getUnitNumber().equalsIgnoreCase(a)).findAny().orElse(null);*/
    }
    @Override
    public Address update(Address address){
        return this.ADDRESS_REPOSITORY.update(address);
    }
    @Override
    public void delete(String a){
        this.ADDRESS_REPOSITORY.delete(a);
    }
    @Override
    public List<Address> findAll(){
        return this.ADDRESS_REPOSITORY.findAll();
    }
}
