package com.example.jq.controller;

import com.example.jq.sakila.tables.pojos.City;
import org.jooq.DSLContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import static com.example.jq.sakila.tables.City.CITY;

@RestController
@RequestMapping("sakila")
public class SakilaController {

    @Resource
    private DSLContext create;

    @GetMapping("cities/{id}")
    public City hello(@PathVariable Short id) {
        return create.selectFrom(CITY).where(CITY.CITY_ID.eq(id)).fetchOneInto(City.class);
    }
}
