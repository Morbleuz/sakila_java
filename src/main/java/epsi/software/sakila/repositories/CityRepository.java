package epsi.software.sakila.repositories;

import epsi.software.sakila.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {

}
