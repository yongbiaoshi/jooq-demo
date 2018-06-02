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
public class Inventory implements Serializable {

    private static final long serialVersionUID = -516288442;

    private Integer   inventoryId;
    private Short     filmId;
    private Byte      storeId;
    private Timestamp lastUpdate;

    public Inventory() {}

    public Inventory(Inventory value) {
        this.inventoryId = value.inventoryId;
        this.filmId = value.filmId;
        this.storeId = value.storeId;
        this.lastUpdate = value.lastUpdate;
    }

    public Inventory(
        Integer   inventoryId,
        Short     filmId,
        Byte      storeId,
        Timestamp lastUpdate
    ) {
        this.inventoryId = inventoryId;
        this.filmId = filmId;
        this.storeId = storeId;
        this.lastUpdate = lastUpdate;
    }

    public Integer getInventoryId() {
        return this.inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Short getFilmId() {
        return this.filmId;
    }

    public void setFilmId(Short filmId) {
        this.filmId = filmId;
    }

    public Byte getStoreId() {
        return this.storeId;
    }

    public void setStoreId(Byte storeId) {
        this.storeId = storeId;
    }

    public Timestamp getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Inventory (");

        sb.append(inventoryId);
        sb.append(", ").append(filmId);
        sb.append(", ").append(storeId);
        sb.append(", ").append(lastUpdate);

        sb.append(")");
        return sb.toString();
    }
}
