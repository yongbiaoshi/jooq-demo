package com.example.jq.controller;

import com.example.jq.schema.tables.pojos.City;
import com.example.jq.service.CityService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import java.util.List;


@RestController
@RequestMapping("cities")
public class CityController {

    private CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("{id}")
    public City city(@PathVariable Short id) {
        return cityService.findById(id);
    }

    @GetMapping("query/country/{id}")
    public List<City> listOfCountry(@PathVariable Short id) {

        return cityService.findByCountryId(id);
    }

    @PostMapping("")
    public City add(City city) {
        return cityService.insert(city);
    }

    @DeleteMapping("{id}")
    public int delete(@PathVariable Short id) {
        return cityService.delete(id);
    }
}
