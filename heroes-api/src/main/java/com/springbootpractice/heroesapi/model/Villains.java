package com.springbootpractice.heroesapi.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Entity (name = "Villains")
public class Villains {

    @Id
    @GeneratedValue( //the ID does not need to go into the data.sql file to be seeded since it will be generated here
            strategy = IDENTITY
    )
    private long id;

    private String villainName;
    private String secretIdentity;
    private String teamName;
    private String image;



    //NO ARGS Constructor
    public Villains( ) { };






    public Villains(String villainName, String secretIdentity, String teamName, String image) {
        this.villainName = villainName;
        this.secretIdentity = secretIdentity;
        this.teamName = teamName;
        this.image = image;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
