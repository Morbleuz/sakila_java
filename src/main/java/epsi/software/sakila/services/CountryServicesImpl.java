package epsi.software.sakila.services;

import epsi.software.sakila.entities.Country;
import epsi.software.sakila.repositories.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServicesImpl implements CountryService {
    private final CountryRepository countryRepository;

    public CountryServicesImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public Country create(Country country) {
        this.countryRepository.save(country);
        this.countryRepository.flush();
        return country;
    }

    @Override
    public Country read(Long id) {
        Optional<Country> country = this.countryRepository.findById(id);
        return country.orElse(null);
    }

    @Override
    public List<Country> readAll() {
        return this.countryRepository.findAll();
    }

    @Override
    public Country update(Country countryModified) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
