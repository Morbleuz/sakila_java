package epsi.software.sakila.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CityServiceTest {

    @Autowired
    CityService service;

    @Test
    void create() {

    }

    @Test
    void read() {
        long l = 177;
        System.out.println(service.read(l).toString());
    }

    @Test
    void readAll() {
        service.readAll().stream().forEach(c -> System.out.println(c.toString()));

    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}