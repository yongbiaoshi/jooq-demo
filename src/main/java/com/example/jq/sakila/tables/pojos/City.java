/*
 * This file is generated by jOOQ.
*/
package com.example.jq.sakila.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class City implements Serializable {

    private static final long serialVersionUID = 205708942;

    private Short     cityId;
    private String    city;
    private Short     countryId;
    private Timestamp lastUpdate;

    public City() {}

    public City(City value) {
        this.cityId = value.cityId;
        this.city = value.city;
        this.countryId = value.countryId;
        this.lastUpdate = value.lastUpdate;
    }

    public City(
        Short     cityId,
        String    city,
        Short     countryId,
        Timestamp lastUpdate
    ) {
        this.cityId = cityId;
        this.city = city;
        this.countryId = countryId;
        this.lastUpdate = lastUpdate;
    }

    public Short getCityId() {
        return this.cityId;
    }

    public void setCityId(Short cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Short getCountryId() {
        return this.countryId;
    }

    public void setCountryId(Short countryId) {
        this.countryId = countryId;
    }

    public Timestamp getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("City (");

        sb.append(cityId);
        sb.append(", ").append(city);
        sb.append(", ").append(countryId);
        sb.append(", ").append(lastUpdate);

        sb.append(")");
        return sb.toString();
    }
}
