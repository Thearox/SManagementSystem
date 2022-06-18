/*
 * Keallan Saunders 219169357
 * ADP ASSIGNMENT JUNE 2022
 * AddressRepository.java
 * Due Date 18 June 2022 23:59
 *
 */
package za.ac.cput.school_management.repository.lookup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.school_management.domain.lookup.Address;

import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address, String> {
    Address update(Address address);

    Optional<Address> read(String unitNumber);
}
