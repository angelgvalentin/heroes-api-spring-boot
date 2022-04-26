package com.springbootpractice.heroesapi.repository;

import com.springbootpractice.heroesapi.model.Heroes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroesInterface extends JpaRepository<Heroes, Long> {


}
