/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sınıflar;

/**
 *
 * @author husey
 */
public class Pokemon {
    private int pokemonID;
    private String pokemonAdi;
    private String pokemonTipi;

    public Pokemon() {
    }
    
    public Pokemon(int pokemonID, String pokemonAdi, String pokemonTipi) {
        this.pokemonID = pokemonID;
        this.pokemonAdi = pokemonAdi;
        this.pokemonTipi = pokemonTipi;
    }

    public int getPokemonID() {
        return pokemonID;
    }

    public void setPokemonID(int pokemonID) {
        this.pokemonID = pokemonID;
    }

    public String getPokemonAdi() {
        return pokemonAdi;
    }

    public void setPokemonAdi(String pokemonAdi) {
        this.pokemonAdi = pokemonAdi;
    }

    public String getPokemonTipi() {
        return pokemonTipi;
    }

    public void setPokemonTipi(String pokemonTipi) {
        this.pokemonTipi = pokemonTipi;
    }
    
    public int hasarPuaniGoster(){
        return 0;
    }
    
    
}

