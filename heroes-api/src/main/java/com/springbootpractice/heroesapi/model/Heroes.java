package com.springbootpractice.heroesapi.model;


import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
public class Heroes {

    @Id
    @SequenceGenerator(
            name = "hero_sequence",
            sequenceName = "hero_sequence",
            allocationSize = 5


    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "hero_sequence"

    )
    private long id;

    private String heroName;
    private String secretIdentity;
    private String teamName;


    //NO ARGS Constructor - check if this is where it goes????????
    public Heroes ( ) { };




    //CONSTRUCTOR - test to see if you can populate the API with some data on start up from HeroesController using this constructor
        //Also check if the ID being a generated value has to go in the constructor or not

    public Heroes(String heroName, String secretIdentity, String teamName) {
        this.heroName = heroName;
        this.secretIdentity = secretIdentity;
        this.teamName = teamName;
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
}
