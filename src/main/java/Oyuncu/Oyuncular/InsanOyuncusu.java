/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oyuncu.Oyuncular;
import Oyuncu.Oyuncu;
import Sınıflar.Pokemon;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author husey
 */
public class InsanOyuncusu extends Oyuncu{

    public InsanOyuncusu() {
    }

    public InsanOyuncusu(int oyuncuID, String oyuncuAdi, int Skor, ArrayList<Pokemon> kartListesi) {
        super(oyuncuID, oyuncuAdi, Skor, kartListesi);
    }
    
    

    @Override
    public ArrayList<Pokemon> KartSecim(ArrayList<Pokemon> gelenListe,Oyuncu Eklencek, int indis) {
        Random rand = new Random();
        int n = rand.nextInt(gelenListe.size());
        Eklencek.desteOlustur(gelenListe.get(n), indis);
        gelenListe.remove(n);
        return gelenListe;
    }
    
    
}
