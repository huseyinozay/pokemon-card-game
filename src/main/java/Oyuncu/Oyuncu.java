/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oyuncu;

import Sınıflar.Pokemon;
import java.util.ArrayList;

/**
 *
 * @author husey
 */
public abstract class Oyuncu {
    private int oyuncuID;
    private String oyuncuAdi;
    private int Skor;
    public ArrayList<Pokemon> kartListesi = new ArrayList<Pokemon>(3);

    public Oyuncu() {
    }

    
    
    public Oyuncu(int oyuncuID, String oyuncuAdi, int Skor, ArrayList<Pokemon> kartListesi) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.Skor = Skor;
        this.kartListesi = kartListesi;
    }
            

    

    public int getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getSkor() {
        return Skor;
    }

    public void setSkor(int Skor) {
        this.Skor = Skor;
    }

    public ArrayList<Pokemon> getKartListesi() {
        return kartListesi;
    }

    public void setKartListesi(ArrayList<Pokemon> kartListesi) {
        this.kartListesi = kartListesi;
    }
    
    public abstract ArrayList<Pokemon> KartSecim(ArrayList<Pokemon> gelenListe, Oyuncu Eklencek, int indis);
    
    public void SkorGoster(){
        
    }
    
    public void desteOlustur(Pokemon eklenecek, int indis){
        kartListesi.add(indis, eklenecek);
    }
}
