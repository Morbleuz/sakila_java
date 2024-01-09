package epsi.software.sakila.services;

import epsi.software.sakila.entities.Country;

import java.util.List;

/*
    Interface CRUD Country
 */
public interface CountryService {

    Country create(Country country);
    Country read(Long id);

    List<Country> readAll();

    Country update(Country countryModified);

    boolean delete(Long id);



}
