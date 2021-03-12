package com.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class Planet {

    String First_UTC;
    String Last_UTC;
    int Month_ordinal;
    String Northern_season;

    public String getFirst_UTC() {
        return First_UTC;
    }

    public void setFirst_UTC(String first_UTC) {
        this.First_UTC = first_UTC;
    }

    public String getLast_UTC() {
        return Last_UTC;
    }

    public void setLast_UTC(String last_UTC) {
        this.Last_UTC = last_UTC;
    }

    public int getMonth_ordinal() {
        return Month_ordinal;
    }

    public void setMonth_ordinal(int month_ordinal) {
        this.Month_ordinal = month_ordinal;
    }

    public String getNorthern_season() {
        return Northern_season;
    }

    public void setNorthern_season(String northern_season) {
        this.Northern_season = northern_season;
    }
//  Pre pre;
  //  Wd wd;
}
