package epsi.software.sakila.services;

import epsi.software.sakila.entities.City;
import java.util.List;

public interface CityService {

    City create(City country);
    City read(Long id);

    List<City> readExpression(String exp);

    List<City> readAll();

    City update(City countryModified);

    boolean delete(Long id);


}
