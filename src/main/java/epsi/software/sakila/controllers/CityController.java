package epsi.software.sakila.controllers;

import epsi.software.sakila.entities.City;
import epsi.software.sakila.entities.Country;
import epsi.software.sakila.services.CityService;
import epsi.software.sakila.services.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {
    private CityService service;
    private static final Logger log = LoggerFactory.getLogger(CountryController.class);
    public CityController(CityService service) {
        this.service = service;
    }

    @GetMapping("/city/")
    public List<City> getAll(){
        log.info("Call get all city");
        return this.service.readAll();
    }
    @GetMapping("/city/{id}")
    public City getOneCountry(@PathVariable Long id) {
        City city = this.service.read(id);
        log.info(city.toString());
        return this.service.read(id);
    }

    @GetMapping("/city/expression/{expression}")
    public List<City> getExpressionCountry(@PathVariable String expression) {
        List<City> citys = this.service.readExpression(expression);
        return citys;
    }
}
