package com.project.pokemon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PokemonController {

    @Autowired
    private PokemonRepository repository;

    @GetMapping(path = "/getAllPokemon")
    public Iterable<PokemonModel> getAllPokemon() {
        return repository.findAll();
    }
}
