package com.project.pokemon;

import org.springframework.data.repository.CrudRepository;

public interface PokemonRepository extends CrudRepository<PokemonModel, Integer> {
}
