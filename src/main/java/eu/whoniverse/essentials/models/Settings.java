package eu.whoniverse.essentials.models;

import eu.whoniverse.essentials.utils.ToJson;

public class Settings extends ToJson {
    private static Settings instance;

    public static Settings getInstance() {
        if (instance == null)
            instance = new Settings();
        return instance;
    }

    private String lang = "IT";
    private Double defaultMoney = 10000.00;
    private Double maxMoney = 10000000000.00;

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Double getDefaultMoney() {
        return defaultMoney;
    }

    public void setDefaultMoney(Double defaultMoney) {
        this.defaultMoney = defaultMoney;
    }

    public Double getMaxMoney() {
        return maxMoney;
    }

    public void setMaxMoney(Double maxMoney) {
        this.maxMoney = maxMoney;
    }
}
