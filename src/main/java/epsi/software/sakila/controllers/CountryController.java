package epsi.software.sakila.controllers;

import epsi.software.sakila.entities.Country;
import epsi.software.sakila.services.CountryService;
import org.apache.juli.logging.Log;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {
    private CountryService service;
    private static final Logger log = LoggerFactory.getLogger(CountryController.class);
    public CountryController(CountryService service) {
        this.service = service;
    }

    @GetMapping("/countries/")
    public List<Country> getAll(){
        log.info("Call get all country");
        return this.service.readAll();
    }
    @GetMapping("/countries/{id}")
    public Country getOneCountry(@PathVariable Long id) {
        Country country = this.service.read(id);
        return country;
    }
}
