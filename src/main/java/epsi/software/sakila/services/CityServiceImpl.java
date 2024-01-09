package epsi.software.sakila.services;

import epsi.software.sakila.entities.City;
import epsi.software.sakila.repositories.CityRepository;
import epsi.software.sakila.repositories.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService{
    private final CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public City create(City country) {
        return null;
    }

    @Override
    public City read(Long id) {
        return this.cityRepository.findById(id).orElse(null);
    }

    @Override
    public List<City> readAll() {
        return this.cityRepository.findAll();
    }

    @Override
    public City update(City countryModified) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
