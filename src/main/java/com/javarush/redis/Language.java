package com.javarush.redis;

import java.math.BigDecimal;

public class Language {

    private String language;

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setOfficial(Boolean official) {
        isOfficial = official;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }
    private Boolean isOfficial;
    private BigDecimal percentage;


}
