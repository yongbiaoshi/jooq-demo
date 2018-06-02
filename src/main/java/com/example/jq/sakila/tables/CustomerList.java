/*
 * This file is generated by jOOQ.
*/
package com.example.jq.sakila.tables;


import com.example.jq.sakila.Sakila;
import com.example.jq.sakila.tables.records.CustomerListRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class CustomerList extends TableImpl<CustomerListRecord> {

    private static final long serialVersionUID = -984372319;

    /**
     * The reference instance of <code>sakila.customer_list</code>
     */
    public static final CustomerList CUSTOMER_LIST = new CustomerList();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomerListRecord> getRecordType() {
        return CustomerListRecord.class;
    }

    /**
     * The column <code>sakila.customer_list.ID</code>.
     */
    public final TableField<CustomerListRecord, Short> ID = createField("ID", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>sakila.customer_list.name</code>.
     */
    public final TableField<CustomerListRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(91), this, "");

    /**
     * The column <code>sakila.customer_list.address</code>.
     */
    public final TableField<CustomerListRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>sakila.customer_list.zip code</code>.
     */
    public final TableField<CustomerListRecord, String> ZIP_CODE = createField("zip code", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>sakila.customer_list.phone</code>.
     */
    public final TableField<CustomerListRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>sakila.customer_list.city</code>.
     */
    public final TableField<CustomerListRecord, String> CITY = createField("city", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>sakila.customer_list.country</code>.
     */
    public final TableField<CustomerListRecord, String> COUNTRY = createField("country", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>sakila.customer_list.notes</code>.
     */
    public final TableField<CustomerListRecord, String> NOTES = createField("notes", org.jooq.impl.SQLDataType.VARCHAR(6).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sakila.customer_list.SID</code>.
     */
    public final TableField<CustomerListRecord, Byte> SID = createField("SID", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * Create a <code>sakila.customer_list</code> table reference
     */
    public CustomerList() {
        this(DSL.name("customer_list"), null);
    }

    /**
     * Create an aliased <code>sakila.customer_list</code> table reference
     */
    public CustomerList(String alias) {
        this(DSL.name(alias), CUSTOMER_LIST);
    }

    /**
     * Create an aliased <code>sakila.customer_list</code> table reference
     */
    public CustomerList(Name alias) {
        this(alias, CUSTOMER_LIST);
    }

    private CustomerList(Name alias, Table<CustomerListRecord> aliased) {
        this(alias, aliased, null);
    }

    private CustomerList(Name alias, Table<CustomerListRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "VIEW");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Sakila.SAKILA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerList as(String alias) {
        return new CustomerList(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerList as(Name alias) {
        return new CustomerList(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomerList rename(String name) {
        return new CustomerList(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomerList rename(Name name) {
        return new CustomerList(name, null);
    }
}
