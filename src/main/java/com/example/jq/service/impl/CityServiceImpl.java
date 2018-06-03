package com.example.jq.service.impl;

import com.example.jq.schema.tables.pojos.City;
import com.example.jq.schema.tables.records.CityRecord;
import com.example.jq.service.CityService;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Row4;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

import static com.example.jq.schema.Tables.CITY;

@Slf4j
@Service
public class CityServiceImpl implements CityService {

    private DSLContext create;

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

    @Override
    public int updateById(City city) {
        // 只能更新非null的字段
        CityRecord record = create.newRecord(CITY, city);
        return record.update();
    }

    @Override
    public int updateByIdAndRollback(City city) {
        CityRecord record = create.newRecord(CITY, city);
        int r = record.update();
        log.info("参数：{}，更新结果：{}", city, r);
        throw new RuntimeException("测试异常，是否可以回滚");
    }

}
