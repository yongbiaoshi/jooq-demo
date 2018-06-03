/*
 * This file is generated by jOOQ.
*/
package com.example.jq.schema;


import com.example.jq.schema.tables.Actor;
import com.example.jq.schema.tables.ActorInfo;
import com.example.jq.schema.tables.Address;
import com.example.jq.schema.tables.Category;
import com.example.jq.schema.tables.City;
import com.example.jq.schema.tables.Country;
import com.example.jq.schema.tables.Customer;
import com.example.jq.schema.tables.CustomerList;
import com.example.jq.schema.tables.Film;
import com.example.jq.schema.tables.FilmActor;
import com.example.jq.schema.tables.FilmCategory;
import com.example.jq.schema.tables.FilmList;
import com.example.jq.schema.tables.FilmText;
import com.example.jq.schema.tables.Inventory;
import com.example.jq.schema.tables.Language;
import com.example.jq.schema.tables.NicerButSlowerFilmList;
import com.example.jq.schema.tables.Payment;
import com.example.jq.schema.tables.Rental;
import com.example.jq.schema.tables.SalesByFilmCategory;
import com.example.jq.schema.tables.SalesByStore;
import com.example.jq.schema.tables.Staff;
import com.example.jq.schema.tables.StaffList;
import com.example.jq.schema.tables.Store;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in sakila
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>sakila.actor</code>.
     */
    public static final Actor ACTOR = com.example.jq.schema.tables.Actor.ACTOR;

    /**
     * VIEW
     */
    public static final ActorInfo ACTOR_INFO = com.example.jq.schema.tables.ActorInfo.ACTOR_INFO;

    /**
     * The table <code>sakila.address</code>.
     */
    public static final Address ADDRESS = com.example.jq.schema.tables.Address.ADDRESS;

    /**
     * The table <code>sakila.category</code>.
     */
    public static final Category CATEGORY = com.example.jq.schema.tables.Category.CATEGORY;

    /**
     * The table <code>sakila.city</code>.
     */
    public static final City CITY = com.example.jq.schema.tables.City.CITY;

    /**
     * The table <code>sakila.country</code>.
     */
    public static final Country COUNTRY = com.example.jq.schema.tables.Country.COUNTRY;

    /**
     * The table <code>sakila.customer</code>.
     */
    public static final Customer CUSTOMER = com.example.jq.schema.tables.Customer.CUSTOMER;

    /**
     * VIEW
     */
    public static final CustomerList CUSTOMER_LIST = com.example.jq.schema.tables.CustomerList.CUSTOMER_LIST;

    /**
     * The table <code>sakila.film</code>.
     */
    public static final Film FILM = com.example.jq.schema.tables.Film.FILM;

    /**
     * The table <code>sakila.film_actor</code>.
     */
    public static final FilmActor FILM_ACTOR = com.example.jq.schema.tables.FilmActor.FILM_ACTOR;

    /**
     * The table <code>sakila.film_category</code>.
     */
    public static final FilmCategory FILM_CATEGORY = com.example.jq.schema.tables.FilmCategory.FILM_CATEGORY;

    /**
     * VIEW
     */
    public static final FilmList FILM_LIST = com.example.jq.schema.tables.FilmList.FILM_LIST;

    /**
     * The table <code>sakila.film_text</code>.
     */
    public static final FilmText FILM_TEXT = com.example.jq.schema.tables.FilmText.FILM_TEXT;

    /**
     * The table <code>sakila.inventory</code>.
     */
    public static final Inventory INVENTORY = com.example.jq.schema.tables.Inventory.INVENTORY;

    /**
     * The table <code>sakila.language</code>.
     */
    public static final Language LANGUAGE = com.example.jq.schema.tables.Language.LANGUAGE;

    /**
     * VIEW
     */
    public static final NicerButSlowerFilmList NICER_BUT_SLOWER_FILM_LIST = com.example.jq.schema.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST;

    /**
     * The table <code>sakila.payment</code>.
     */
    public static final Payment PAYMENT = com.example.jq.schema.tables.Payment.PAYMENT;

    /**
     * The table <code>sakila.rental</code>.
     */
    public static final Rental RENTAL = com.example.jq.schema.tables.Rental.RENTAL;

    /**
     * VIEW
     */
    public static final SalesByFilmCategory SALES_BY_FILM_CATEGORY = com.example.jq.schema.tables.SalesByFilmCategory.SALES_BY_FILM_CATEGORY;

    /**
     * VIEW
     */
    public static final SalesByStore SALES_BY_STORE = com.example.jq.schema.tables.SalesByStore.SALES_BY_STORE;

    /**
     * The table <code>sakila.staff</code>.
     */
    public static final Staff STAFF = com.example.jq.schema.tables.Staff.STAFF;

    /**
     * VIEW
     */
    public static final StaffList STAFF_LIST = com.example.jq.schema.tables.StaffList.STAFF_LIST;

    /**
     * The table <code>sakila.store</code>.
     */
    public static final Store STORE = com.example.jq.schema.tables.Store.STORE;
}