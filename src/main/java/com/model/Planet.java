package com.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class Planet {

    String firstUtc;
    String lastUtc;
    int monthOrdinal ;
    String northernSeason;

    public String getFirstUtc() {
        return firstUtc;
    }

    public void setFirstUtc(String firstUtc) {
        this.firstUtc = firstUtc;
    }

    public String getLastUtc() {
        return lastUtc;
    }

    public void setLastUtc(String lastUtc) {
        this.lastUtc = lastUtc;
    }

    public int getMonthOrdinal() {
        return monthOrdinal;
    }

    public void setMonthOrdinal(int monthOrdinal) {
        this.monthOrdinal = monthOrdinal;
    }

    public String getNorthernSeason() {
        return northernSeason;
    }

    public void setNorthernSeason(String northernSeason) {
        this.northernSeason = northernSeason;
    }
//  Pre pre;
  //  Wd wd;
}
