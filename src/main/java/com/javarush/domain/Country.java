package com.javarush.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(schema = "world", name = "country")
public class Country {
    public String getCode() {
        return code;
    }

    public String getAlternativeCode() {
        return alternativeCode;
    }

    public String getName() {
        return name;
    }

    public Continent getContinent() {
        return continent;
    }

    public String getRegion() {
        return region;
    }

    public BigDecimal getSurfaceArea() {
        return surfaceArea;
    }
    public Integer getPopulation() {
        return population;
    }
    public Set<CountryLanguage> getLanguages() {
        return languages;
    }

    @Id
    @Column(name = "id")
    private Integer id;

    private String code;

    @Column(name = "code_2")
    private String alternativeCode;

    private String name;

    @Column(name = "continent")
    @Enumerated(EnumType.ORDINAL)
    private Continent continent;

    private String region;

    @Column(name = "surface_area")
    private BigDecimal surfaceArea;

    @Column(name = "indep_year")
    private Short independenceYear;

    private Integer population;

    @Column(name = "life_expectancy")
    private BigDecimal lifeExpectancy;

    @Column(name = "gnp")
    private BigDecimal GNP;

    @Column(name = "gnpo_id")
    private BigDecimal GNPOId;

    @Column(name = "local_name")
    private String localName;

    @Column(name = "government_form")
    private String governmentForm;

    @Column(name = "head_of_state")
    private String headOfState;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "capital")
    private City city;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "country_id")
    private Set<CountryLanguage> languages;
}
