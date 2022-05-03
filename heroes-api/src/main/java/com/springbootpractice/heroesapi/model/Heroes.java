package com.springbootpractice.heroesapi.model;


import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity ( name = "Heroes")
public class Heroes {

    @Id
    @GeneratedValue( //the ID does not need to go into the data.sql file to be seeded since it will be generated here
            strategy = IDENTITY

    )
    private long id;

    private String heroName;
    private String secretIdentity;
    private String teamName;
    private String image;


    //NO ARGS Constructor
    public Heroes ( ) { };




    //CONSTRUCTOR - test to see if you can populate the API with some data on start up from HeroesController using this constructor
        //Also check if the ID being a generated value has to go in the constructor or not

    public Heroes(String heroName, String secretIdentity, String teamName, String image) {
        this.heroName = heroName;
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

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
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
