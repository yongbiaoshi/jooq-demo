/*
 * This file is generated by jOOQ.
*/
package com.example.jq.schema.tables.pojos;


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
public class Rental implements Serializable {

    private static final long serialVersionUID = 1691555738;

    private Integer   rentalId;
    private Timestamp rentalDate;
    private Integer   inventoryId;
    private Short     customerId;
    private Timestamp returnDate;
    private Byte      staffId;
    private Timestamp lastUpdate;

    public Rental() {}

    public Rental(Rental value) {
        this.rentalId = value.rentalId;
        this.rentalDate = value.rentalDate;
        this.inventoryId = value.inventoryId;
        this.customerId = value.customerId;
        this.returnDate = value.returnDate;
        this.staffId = value.staffId;
        this.lastUpdate = value.lastUpdate;
    }

    public Rental(
        Integer   rentalId,
        Timestamp rentalDate,
        Integer   inventoryId,
        Short     customerId,
        Timestamp returnDate,
        Byte      staffId,
        Timestamp lastUpdate
    ) {
        this.rentalId = rentalId;
        this.rentalDate = rentalDate;
        this.inventoryId = inventoryId;
        this.customerId = customerId;
        this.returnDate = returnDate;
        this.staffId = staffId;
        this.lastUpdate = lastUpdate;
    }

    public Integer getRentalId() {
        return this.rentalId;
    }

    public void setRentalId(Integer rentalId) {
        this.rentalId = rentalId;
    }

    public Timestamp getRentalDate() {
        return this.rentalDate;
    }

    public void setRentalDate(Timestamp rentalDate) {
        this.rentalDate = rentalDate;
    }

    public Integer getInventoryId() {
        return this.inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Short getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Short customerId) {
        this.customerId = customerId;
    }

    public Timestamp getReturnDate() {
        return this.returnDate;
    }

    public void setReturnDate(Timestamp returnDate) {
        this.returnDate = returnDate;
    }

    public Byte getStaffId() {
        return this.staffId;
    }

    public void setStaffId(Byte staffId) {
        this.staffId = staffId;
    }

    public Timestamp getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Rental (");

        sb.append(rentalId);
        sb.append(", ").append(rentalDate);
        sb.append(", ").append(inventoryId);
        sb.append(", ").append(customerId);
        sb.append(", ").append(returnDate);
        sb.append(", ").append(staffId);
        sb.append(", ").append(lastUpdate);

        sb.append(")");
        return sb.toString();
    }
}