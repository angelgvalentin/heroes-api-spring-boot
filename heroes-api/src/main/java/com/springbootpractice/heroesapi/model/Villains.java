package com.springbootpractice.heroesapi.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Entity (name = "Villains")
public class Villains {

    @Id
    @GeneratedValue(
            strategy = IDENTITY
    )
    private long id;

    private String villainName;
    private String secretIdentity;
    private String teamName;


    //NO ARGS Constructor - check if this is where it goes????????
    public Villains( ) { };




    //CONSTRUCTOR - test to see if you can populate the API with some data on start up from HeroesController using this constructor
        //Also check if the ID being a generated value has to go in the constructor or not

    public Villains(String villainName, String secretIdentity, String teamName) {
        this.villainName = villainName;
        this.secretIdentity = secretIdentity;
        this.teamName = teamName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVillainName() {
        return villainName;
    }

    public void setVillainName(String villainName) {
        this.villainName = villainName;
    }

    public String getSecretIdentity() {
        return secretIdentity;
    }

    public void setSecretIdentity(String secretIdentity) {
        this.secretIdentity = secretIdentity;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
