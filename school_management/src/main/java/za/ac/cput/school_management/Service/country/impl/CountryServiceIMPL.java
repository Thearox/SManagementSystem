package za.ac.cput.school_management.Service.country.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.school_management.Service.country.CountryService;
import za.ac.cput.school_management.domain.country.Country;
import za.ac.cput.school_management.repository.country.CountryRepository;
import za.ac.cput.school_management.repository.country.impl.CountryRepositoryIMPL;


@Service
public class CountryServiceIMPL implements CountryService {

    private static CountryService countryService = null;
    private CountryRepository countryRepository;

    private CountryServiceIMPL() {
        this.countryRepository = (CountryRepository) CountryRepositoryIMPL.getCountryList();
    }

    public static CountryService getCountryService() {
        if (countryService == null)
            countryService = new CountryServiceIMPL();
        return countryService;
    }

    public Country save(Country country) {
        return this.countryRepository.save(country);
    }

    public Country read(String a) {
        return this.countryRepository.read(a);
    }

    public Country update(Country country) {
        return this.countryRepository.update(country);
    }

    public void delete(String a) {
        this.countryRepository.delete(a);
    }

}
