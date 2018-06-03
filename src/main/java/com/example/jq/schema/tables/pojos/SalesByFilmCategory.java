/*
 * This file is generated by jOOQ.
*/
package com.example.jq.schema.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;

import javax.annotation.Generated;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SalesByFilmCategory implements Serializable {

    private static final long serialVersionUID = 1202072410;

    private String     category;
    private BigDecimal totalSales;

    public SalesByFilmCategory() {}

    public SalesByFilmCategory(SalesByFilmCategory value) {
        this.category = value.category;
        this.totalSales = value.totalSales;
    }

    public SalesByFilmCategory(
        String     category,
        BigDecimal totalSales
    ) {
        this.category = category;
        this.totalSales = totalSales;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getTotalSales() {
        return this.totalSales;
    }

    public void setTotalSales(BigDecimal totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SalesByFilmCategory (");

        sb.append(category);
        sb.append(", ").append(totalSales);

        sb.append(")");
        return sb.toString();
    }
}