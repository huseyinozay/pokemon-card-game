/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sınıflar.pokemonlar;
import Sınıflar.Pokemon;
/**
 *
 * @author husey
 */
public class psyduck extends Pokemon{
    private int hasarPuani;
    private boolean kartKullanildiMi = false;

    public psyduck() {
    }

    public psyduck(int pokemonID, String pokemonAdi, String pokemonTipi) {
        super(pokemonID, pokemonAdi, pokemonTipi);
    }

    public psyduck(int hasarPuani, int pokemonID, String pokemonAdi, String pokemonTipi) {
        super(pokemonID, pokemonAdi, pokemonTipi);
        this.hasarPuani = hasarPuani;
    }

    public int getHasarPuani() {
        return hasarPuani;
    }

    public void setHasarPuani(int hasarPuani) {
        this.hasarPuani = hasarPuani;
    }

    @Override
    public int hasarPuaniGoster() {
        super.hasarPuaniGoster(); //To change body of generated methods, choose Tools | Templates.
        return hasarPuani;
    }
    
    
}
