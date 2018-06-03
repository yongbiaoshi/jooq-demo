package com.example.jq.service.impl;

import com.example.jq.schema.tables.pojos.City;
import com.example.jq.service.CityService;
import org.jooq.DSLContext;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.jq.schema.Tables.CITY;

@Service
public class CityServiceImpl implements CityService {

    DSLContext create;

    public CityServiceImpl(DSLContext dslContext) {
        this.create = dslContext;
    }

    @Override
    public City findById(Short id) {
        return create.selectFrom(CITY).where(CITY.CITY_ID.eq(id)).fetchOneInto(City.class);
    }

    @Override
    public List<City> findByCountryId(Short id) {
        return create.selectFrom(CITY).where(CITY.COUNTRY_ID.eq(id)).fetchInto(City.class);
    }

    @Override
    public City insert(City city) {
        city = create.insertInto(CITY).columns(CITY.CITY_, CITY.COUNTRY_ID).values(city.getCity(), city.getCountryId()).returning().fetchOne().into(City.class);
        return city;
    }

    @Override
    public int delete(Short id) {
        return create.deleteFrom(CITY).where(CITY.CITY_ID.eq(id)).execute();
    }
}
