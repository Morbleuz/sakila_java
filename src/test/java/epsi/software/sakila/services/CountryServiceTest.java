package epsi.software.sakila.services;

import epsi.software.sakila.entities.Country;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CountryServiceTest {

    @Autowired
    CountryService service;

    @Test
    void read() {
    }

    @Test
    void readAll() {
        List<Country> countries = service.readAll();
        countries.forEach(c -> System.out.println(c));
    }
}