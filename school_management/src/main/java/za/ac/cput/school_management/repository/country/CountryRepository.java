package za.ac.cput.school_management.repository.country;

/*
Mogammad-Redar Behardien _ 216234107
ADP3 JUNE ASSIGNMENT
CountryRepository.java
*/

import za.ac.cput.school_management.domain.country.Country;
import za.ac.cput.school_management.repository.IRepository;
import java.util.List;

public interface CountryRepository extends IRepository<Country, String>{
    List<Country> findAll();
}
