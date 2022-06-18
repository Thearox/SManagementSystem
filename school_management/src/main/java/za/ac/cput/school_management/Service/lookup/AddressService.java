package za.ac.cput.school_management.Service.lookup;

import za.ac.cput.school_management.Service.IService;
import za.ac.cput.school_management.domain.lookup.Address;

import java.util.List;

public interface AddressService extends IService<Address, String> {
    List<Address> findAll();
}
