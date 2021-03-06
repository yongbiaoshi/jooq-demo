/*
 * This file is generated by jOOQ.
*/
package com.example.jq.schema.tables.pojos;


import com.example.jq.schema.enums.FilmRating;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
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
public class Film implements Serializable {

    private static final long serialVersionUID = -46371031;

    private Short      filmId;
    private String     title;
    private String     description;
    private Date       releaseYear;
    private Byte       languageId;
    private Byte       originalLanguageId;
    private Byte       rentalDuration;
    private BigDecimal rentalRate;
    private Short      length;
    private BigDecimal replacementCost;
    private FilmRating rating;
    private String     specialFeatures;
    private Timestamp  lastUpdate;

    public Film() {}

    public Film(Film value) {
        this.filmId = value.filmId;
        this.title = value.title;
        this.description = value.description;
        this.releaseYear = value.releaseYear;
        this.languageId = value.languageId;
        this.originalLanguageId = value.originalLanguageId;
        this.rentalDuration = value.rentalDuration;
        this.rentalRate = value.rentalRate;
        this.length = value.length;
        this.replacementCost = value.replacementCost;
        this.rating = value.rating;
        this.specialFeatures = value.specialFeatures;
        this.lastUpdate = value.lastUpdate;
    }

    public Film(
        Short      filmId,
        String     title,
        String     description,
        Date       releaseYear,
        Byte       languageId,
        Byte       originalLanguageId,
        Byte       rentalDuration,
        BigDecimal rentalRate,
        Short      length,
        BigDecimal replacementCost,
        FilmRating rating,
        String     specialFeatures,
        Timestamp  lastUpdate
    ) {
        this.filmId = filmId;
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.languageId = languageId;
        this.originalLanguageId = originalLanguageId;
        this.rentalDuration = rentalDuration;
        this.rentalRate = rentalRate;
        this.length = length;
        this.replacementCost = replacementCost;
        this.rating = rating;
        this.specialFeatures = specialFeatures;
        this.lastUpdate = lastUpdate;
    }

    public Short getFilmId() {
        return this.filmId;
    }

    public void setFilmId(Short filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(Date releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Byte getLanguageId() {
        return this.languageId;
    }

    public void setLanguageId(Byte languageId) {
        this.languageId = languageId;
    }

    public Byte getOriginalLanguageId() {
        return this.originalLanguageId;
    }

    public void setOriginalLanguageId(Byte originalLanguageId) {
        this.originalLanguageId = originalLanguageId;
    }

    public Byte getRentalDuration() {
        return this.rentalDuration;
    }

    public void setRentalDuration(Byte rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public BigDecimal getRentalRate() {
        return this.rentalRate;
    }

    public void setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
    }

    public Short getLength() {
        return this.length;
    }

    public void setLength(Short length) {
        this.length = length;
    }

    public BigDecimal getReplacementCost() {
        return this.replacementCost;
    }

    public void setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
    }

    public FilmRating getRating() {
        return this.rating;
    }

    public void setRating(FilmRating rating) {
        this.rating = rating;
    }

    public String getSpecialFeatures() {
        return this.specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public Timestamp getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Film (");

        sb.append(filmId);
        sb.append(", ").append(title);
        sb.append(", ").append(description);
        sb.append(", ").append(releaseYear);
        sb.append(", ").append(languageId);
        sb.append(", ").append(originalLanguageId);
        sb.append(", ").append(rentalDuration);
        sb.append(", ").append(rentalRate);
        sb.append(", ").append(length);
        sb.append(", ").append(replacementCost);
        sb.append(", ").append(rating);
        sb.append(", ").append(specialFeatures);
        sb.append(", ").append(lastUpdate);

        sb.append(")");
        return sb.toString();
    }
}
