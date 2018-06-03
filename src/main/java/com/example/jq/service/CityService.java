package com.example.jq.service;

import com.example.jq.schema.tables.pojos.City;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CityService {

    City findById(Short id);

    List<City> findByCountryId(Short id);

    City insert(City city);

    int delete(Short id);

    int updateById(City city);

    @Transactional
    int updateByIdAndRollback(City city);
}
