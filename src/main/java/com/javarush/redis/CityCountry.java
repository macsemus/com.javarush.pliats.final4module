package com.javarush.redis;

import com.javarush.domain.Continent;

import java.math.BigDecimal;
import java.util.Set;

public class CityCountry {
    private Integer id;

    private String name;

    private String district;

    private Integer population;

    private String countryCode;

    private String alternativeCountryCode;

    private String countryName;

    private Continent continent;

    private String countryRegion;

    private BigDecimal countrySurfaceArea;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setAlternativeCountryCode(String alternativeCountryCode) {
        this.alternativeCountryCode = alternativeCountryCode;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public void setCountryRegion(String countryRegion) {
        this.countryRegion = countryRegion;
    }

    public void setCountrySurfaceArea(BigDecimal countrySurfaceArea) {
        this.countrySurfaceArea = countrySurfaceArea;
    }

    public void setCountryPopulation(Integer countryPopulation) {
        this.countryPopulation = countryPopulation;
    }

    public void setLanguages(Set<Language> languages) {
        this.languages = languages;
    }

    public Integer getId() {
        return id;
    }

    private Integer countryPopulation;

    private Set<Language> languages;


}
