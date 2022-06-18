/*
 *Keallan Saunders 219169357
 * ADP ASSIGNMENT JUNE 2022
 * q6iIMPL.java
 * Due Date 18 June 2022 23:59
 * */
package za.ac.cput.school_management.Service.q6.impl;

import za.ac.cput.school_management.Service.city.CityService;
import za.ac.cput.school_management.Service.city.impl.CityServiceIMPL;
import za.ac.cput.school_management.Service.lookup.AddressService;
import za.ac.cput.school_management.Service.lookup.impl.AddressServiceIMPL;
import za.ac.cput.school_management.Service.q6.q6Service;
import za.ac.cput.school_management.domain.repository.lookup.impl.AddressRepositoryIMPL;
import za.ac.cput.school_management.repository.city.CityRepository;
import za.ac.cput.school_management.repository.city.impl.CityRepositoryIMPL;

public class q6iIMPL implements q6Service {
    private static q6iIMPL q6IIMPL ;
    private CityRepository cityRepository;

    private q6iIMPL() {
        this.cityRepository = (CityRepository) CityRepositoryIMPL.getCityList();
    }


}
