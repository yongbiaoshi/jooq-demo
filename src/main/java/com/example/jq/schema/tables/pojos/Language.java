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
public class Language implements Serializable {

    private static final long serialVersionUID = 1324988728;

    private Byte      languageId;
    private String    name;
    private Timestamp lastUpdate;

    public Language() {}

    public Language(Language value) {
        this.languageId = value.languageId;
        this.name = value.name;
        this.lastUpdate = value.lastUpdate;
    }

    public Language(
        Byte      languageId,
        String    name,
        Timestamp lastUpdate
    ) {
        this.languageId = languageId;
        this.name = name;
        this.lastUpdate = lastUpdate;
    }

    public Byte getLanguageId() {
        return this.languageId;
    }

    public void setLanguageId(Byte languageId) {
        this.languageId = languageId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Language (");

        sb.append(languageId);
        sb.append(", ").append(name);
        sb.append(", ").append(lastUpdate);

        sb.append(")");
        return sb.toString();
    }
}
