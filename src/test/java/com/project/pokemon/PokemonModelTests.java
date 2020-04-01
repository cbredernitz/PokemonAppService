package com.project.pokemon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokemonModelTests {

    @Test
    public void givenSetId5_whenGetId_thenReturn5() {
        PokemonModel pokemonModel = new PokemonModel();
        pokemonModel.setId(5);
        assertEquals(pokemonModel.getId(), 5);
    }

    @Test
    public void givenSetNameBulbasaur_whenGetName_thenReturnBulbasaur() {
        PokemonModel pokemonModel = new PokemonModel();
        pokemonModel.setName("Bulbasaur");
        assertEquals(pokemonModel.getName(), "Bulbasaur");
    }

    @Test
    public void givenSetTypeOneGrass_whenGetTypeOne_thenReturnGrass() {
        PokemonModel pokemonModel = new PokemonModel();
        pokemonModel.setTypeOne("Grass");
        assertEquals(pokemonModel.getTypeOne(), "Grass");
    }

    @Test
    public void givenSetTypeTwoPoison_whenGetTypeTwo_thenReturnPoison() {
        PokemonModel pokemonModel = new PokemonModel();
        pokemonModel.setTypeTwo("Poison");
        assertEquals(pokemonModel.getTypeTwo(), "Poison");
    }

    @Test
    public void givenSetAbilitiesOvergrow_whenGetAbilities_thenReturnOvergrow() {
        PokemonModel pokemonModel = new PokemonModel();
        pokemonModel.setAbilities("Overgrow");
        assertEquals(pokemonModel.getAbilities(), "Overgrow");
    }

    @Test
    public void givenSetCategorySeed_whenGetCategory_thenReturnSeed() {
        PokemonModel pokemonModel = new PokemonModel();
        pokemonModel.setCategory("Seed");
        assertEquals(pokemonModel.getCategory(), "Seed");
    }

    @Test
    public void givenSetHeightInFeet4point9_whenGetHeightInFeet_thenReturn4point9() {
        PokemonModel pokemonModel = new PokemonModel();
        pokemonModel.setHeightInFeet(4.09);
        assertEquals(pokemonModel.getHeightInFeet(), 4.09);
    }

    @Test
    public void givenSetHeightInMeters2_whenGetHeightInMeters_thenReturn2() {
        PokemonModel pokemonModel = new PokemonModel();
        pokemonModel.setHeightInMeters(2);
        assertEquals(pokemonModel.getHeightInMeters(), 2);
    }

    @Test
    public void givenSetWeightInPounds150_whenGetWeightInPounds_thenReturn150() {
        PokemonModel pokemonModel = new PokemonModel();
        pokemonModel.setWeightInPounds(150);
        assertEquals(pokemonModel.getWeightInPounds(), 150);
    }

    @Test
    public void givenSetWeightInKilograms150_whenGetWeightInKilograms_thenReturn150() {
        PokemonModel pokemonModel = new PokemonModel();
        pokemonModel.setWeightInKilograms(150);
        assertEquals(pokemonModel.getWeightInKilograms(), 150);
    }

    @Test
    public void givenSetCaptureRate255_whenGetCaptureRate_thenReturn255() {
        PokemonModel pokemonModel = new PokemonModel();
        pokemonModel.setCaptureRate(255);
        assertEquals(pokemonModel.getCaptureRate(), 255);
    }

    //Add egg_steps, exp_group here later

    @Test
    public void givenSetTotal200_whenGetTotal_thenReturn200() {
        PokemonModel pokemonModel = new PokemonModel();
        pokemonModel.setTotal(200);
        assertEquals(pokemonModel.getTotal(), 200);
    }

    @Test
    public void givenSetHealthPoints200_whenGetHealthPoints_thenReturn200() {
        PokemonModel pokemonModel = new PokemonModel();
        pokemonModel.setHealthPoints(200);
        assertEquals(pokemonModel.getHealthPoints(), 200);
    }


    @Test
    public void givenSetAttack200_whenGetAttack_thenReturn200() {
        PokemonModel pokemonModel = new PokemonModel();
        pokemonModel.setAttack(200);
        assertEquals(pokemonModel.getAttack(), 200);
    }

    @Test
    public void givenSetDefense200_whenGetDefense_thenReturn200() {
        PokemonModel pokemonModel = new PokemonModel();
        pokemonModel.setDefense(200);
        assertEquals(pokemonModel.getDefense(), 200);
    }

    @Test
    public void givenSetSpecialAttack200_whenGetSpecialAttack_thenReturn200() {
        PokemonModel pokemonModel = new PokemonModel();
        pokemonModel.setSpecialAttack(200);
        assertEquals(pokemonModel.getSpecialAttack(), 200);
    }

    @Test
    public void givenSetSpecialDefense200_whenGetSpecialDefense_thenReturn200() {
        PokemonModel pokemonModel = new PokemonModel();
        pokemonModel.setSpecialDefense(200);
        assertEquals(pokemonModel.getSpecialDefense(), 200);
    }

    @Test
    public void givenSetSpeed200_whenGetSpeed_thenReturn200() {
        PokemonModel pokemonModel = new PokemonModel();
        pokemonModel.setSpeed(200);
        assertEquals(pokemonModel.getSpeed(), 200);
    }
}
