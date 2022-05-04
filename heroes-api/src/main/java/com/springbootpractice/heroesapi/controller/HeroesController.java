package com.springbootpractice.heroesapi.controller;

import com.springbootpractice.heroesapi.model.Heroes;
import com.springbootpractice.heroesapi.repository.HeroesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/roster")
public class HeroesController {

    @Autowired
    private HeroesInterface repository;




    @GetMapping("/heroes")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Heroes> getAllHeroes( ) {
        return repository.findAll();
    }

    @GetMapping ("/heroes/{id}")
    public Optional<Heroes> getSpecificHero(@PathVariable long id) {
       return  repository.findById(id);
    }


    @PostMapping("/heroes")
    public Heroes addHero(@RequestBody Heroes newHero) {

        return repository.save(newHero);
    }

    @PutMapping("/heroes/{id}")
    public Optional<Heroes> updateHero(@RequestBody Heroes updatedHero, @PathVariable long id) {
        return repository.findById(id).map( update -> {
            update.setHeroName(updatedHero.getHeroName());
            update.setSecretIdentity(updatedHero.getSecretIdentity());
            update.setTeamName(updatedHero.getTeamName());
            return repository.save(update);
        });
    }


    @DeleteMapping ("/heroes/{id}")
    public void deleteHero(@PathVariable long id) {
          repository.deleteById(id);
    }


}
