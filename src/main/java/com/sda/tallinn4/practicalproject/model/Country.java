package com.sda.tallinn4.practicalproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {

    @Id
    @Column(name = "geoname_id")
    private Integer id;

    @Column(name = "continent_code")
    private String continentCode;

    @Column(name = "continent_name")
    private String continentName;

    @Column(name = "country_iso_code")
    private String countryCode;

    @Column(name = "country_name")
    private String countryName;

    @Column(name = "is_in_european_union")
    private Boolean countryIsInEU;
}

