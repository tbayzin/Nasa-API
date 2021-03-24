package com.model;

import org.springframework.data.annotation.Id;
import javax.persistence.*;

@Entity
public class Planet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String planetName;
    private String planetCode;

    public Planet() {
    }

    public Planet(Long id, String planetName, String planetCode) {
        this.id = id;
        this.planetName = planetName;
        this.planetCode = planetCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getPlanetCode() {
        return planetCode;
    }

    public void setPlanetCode(String planetCode) {
        this.planetCode = planetCode;
    }
}
