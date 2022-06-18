/*
 *Keallan Saunders 219169357
 * ADP ASSIGNMENT JUNE 2022
 * AddressService.java
 * Due Date 18 June 2022 23:59
 * */
package za.ac.cput.school_management.Service.lookup;

import za.ac.cput.school_management.Service.IService;
import za.ac.cput.school_management.domain.lookup.Address;

import java.util.List;

public interface AddressService extends IService<Address, String> {
    List<Address> findAll();
}
