package com.example.jq.service;

import com.example.jq.schema.tables.pojos.City;

import java.util.List;

public interface CityService {

    City findById(Short id);
    List<City> findByCountryId(Short id);
    City insert(City city);
    int delete(Short id);
}
