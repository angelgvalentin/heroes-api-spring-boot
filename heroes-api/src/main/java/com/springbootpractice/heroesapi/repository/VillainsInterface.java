package com.springbootpractice.heroesapi.repository;

import com.springbootpractice.heroesapi.model.Villains;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VillainsInterface extends JpaRepository<Villains, Long> {


}
