/*
 * This file is generated by jOOQ.
*/
package com.example.jq.sakila.tables.records;


import com.example.jq.sakila.tables.City;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CityRecord extends UpdatableRecordImpl<CityRecord> implements Record4<Short, String, Short, Timestamp> {

    private static final long serialVersionUID = -1044610016;

    /**
     * Setter for <code>sakila.city.city_id</code>.
     */
    public void setCityId(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>sakila.city.city_id</code>.
     */
    public Short getCityId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>sakila.city.city</code>.
     */
    public void setCity(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sakila.city.city</code>.
     */
    public String getCity() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sakila.city.country_id</code>.
     */
    public void setCountryId(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>sakila.city.country_id</code>.
     */
    public Short getCountryId() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>sakila.city.last_update</code>.
     */
    public void setLastUpdate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>sakila.city.last_update</code>.
     */
    public Timestamp getLastUpdate() {
        return (Timestamp) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Short> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Short, String, Short, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Short, String, Short, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field1() {
        return City.CITY.CITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return City.CITY.CITY_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return City.CITY.COUNTRY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return City.CITY.LAST_UPDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component1() {
        return getCityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component3() {
        return getCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getLastUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value1() {
        return getCityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getLastUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CityRecord value1(Short value) {
        setCityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CityRecord value2(String value) {
        setCity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CityRecord value3(Short value) {
        setCountryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CityRecord value4(Timestamp value) {
        setLastUpdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CityRecord values(Short value1, String value2, Short value3, Timestamp value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CityRecord
     */
    public CityRecord() {
        super(City.CITY);
    }

    /**
     * Create a detached, initialised CityRecord
     */
    public CityRecord(Short cityId, String city, Short countryId, Timestamp lastUpdate) {
        super(City.CITY);

        set(0, cityId);
        set(1, city);
        set(2, countryId);
        set(3, lastUpdate);
    }
}
