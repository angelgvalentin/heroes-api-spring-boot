package com.springbootpractice.heroesapi.controller;

import com.springbootpractice.heroesapi.model.Heroes;
import com.springbootpractice.heroesapi.model.Villains;
import com.springbootpractice.heroesapi.repository.VillainsInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/roster")
public class VillainsController {

    @Autowired
    private VillainsInterface repository;




    @GetMapping("/villains")
    public List<Villains> getAllVillains( ) {
        return repository.findAll();
    }

    @GetMapping ("/villains/{id}")
    public Optional<Villains> getSpecificVillain(@PathVariable long id) {
       return  repository.findById(id);
    }
    

    @PostMapping("/villains")
    public Villains addVillain(@RequestBody Villains newVillain) {
      return  repository.save(newVillain);
    }

    @PutMapping("/villains/{id}")
    public Optional<Villains> updateVillain(@RequestBody Villains updatedVillain, @PathVariable long id) {
        return repository.findById(id).map( update -> {
            update.setVillainName(updatedVillain.getVillainName());
            update.setSecretIdentity(updatedVillain.getSecretIdentity());
            update.setTeamName(updatedVillain.getTeamName());
            return repository.save(update);
        });
    }


    @DeleteMapping ("/villains/{id}")
    public void deleteVillain(@PathVariable long id) {
        repository.deleteById(id);
    }


}
