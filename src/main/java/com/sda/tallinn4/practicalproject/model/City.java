package com.sda.tallinn4.practicalproject.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City {

    @Id
    @Column(name = "geoname_id")
    private Integer id;

    @Column(name = "continent_name")
    private String continentName;

    @Column(name = "country_iso_name")
    private String countryCode;

    @Column(name = "country_name")
    private String countryName;

    @Column(name = "region_name")
    private String region;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "time_zone")
    private String timeZone;

    @Column(name = "is_in_european_union")
    private Boolean cityIsInEU;
}
