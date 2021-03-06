/*
 * This file is generated by jOOQ.
*/
package com.example.jq.schema.tables.records;


import com.example.jq.schema.tables.Customer;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class CustomerRecord extends UpdatableRecordImpl<CustomerRecord> implements Record9<Short, Byte, String, String, String, Short, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = 4435126;

    /**
     * Setter for <code>sakila.customer.customer_id</code>.
     */
    public void setCustomerId(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>sakila.customer.customer_id</code>.
     */
    public Short getCustomerId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>sakila.customer.store_id</code>.
     */
    public void setStoreId(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>sakila.customer.store_id</code>.
     */
    public Byte getStoreId() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>sakila.customer.first_name</code>.
     */
    public void setFirstName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sakila.customer.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sakila.customer.last_name</code>.
     */
    public void setLastName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sakila.customer.last_name</code>.
     */
    public String getLastName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sakila.customer.email</code>.
     */
    public void setEmail(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sakila.customer.email</code>.
     */
    public String getEmail() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sakila.customer.address_id</code>.
     */
    public void setAddressId(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>sakila.customer.address_id</code>.
     */
    public Short getAddressId() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>sakila.customer.active</code>.
     */
    public void setActive(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>sakila.customer.active</code>.
     */
    public Byte getActive() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>sakila.customer.create_date</code>.
     */
    public void setCreateDate(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>sakila.customer.create_date</code>.
     */
    public Timestamp getCreateDate() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>sakila.customer.last_update</code>.
     */
    public void setLastUpdate(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>sakila.customer.last_update</code>.
     */
    public Timestamp getLastUpdate() {
        return (Timestamp) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Short, Byte, String, String, String, Short, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Short, Byte, String, String, String, Short, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field1() {
        return Customer.CUSTOMER.CUSTOMER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field2() {
        return Customer.CUSTOMER.STORE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Customer.CUSTOMER.FIRST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Customer.CUSTOMER.LAST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Customer.CUSTOMER.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return Customer.CUSTOMER.ADDRESS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return Customer.CUSTOMER.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Customer.CUSTOMER.CREATE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return Customer.CUSTOMER.LAST_UPDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component1() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component2() {
        return getStoreId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component6() {
        return getAddressId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component7() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getCreateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getLastUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value1() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value2() {
        return getStoreId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getAddressId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getLastUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord value1(Short value) {
        setCustomerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord value2(Byte value) {
        setStoreId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord value3(String value) {
        setFirstName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord value4(String value) {
        setLastName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord value5(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord value6(Short value) {
        setAddressId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord value7(Byte value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord value8(Timestamp value) {
        setCreateDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord value9(Timestamp value) {
        setLastUpdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord values(Short value1, Byte value2, String value3, String value4, String value5, Short value6, Byte value7, Timestamp value8, Timestamp value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CustomerRecord
     */
    public CustomerRecord() {
        super(Customer.CUSTOMER);
    }

    /**
     * Create a detached, initialised CustomerRecord
     */
    public CustomerRecord(Short customerId, Byte storeId, String firstName, String lastName, String email, Short addressId, Byte active, Timestamp createDate, Timestamp lastUpdate) {
        super(Customer.CUSTOMER);

        set(0, customerId);
        set(1, storeId);
        set(2, firstName);
        set(3, lastName);
        set(4, email);
        set(5, addressId);
        set(6, active);
        set(7, createDate);
        set(8, lastUpdate);
    }
}
