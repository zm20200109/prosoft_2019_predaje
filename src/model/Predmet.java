/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Acer
 */
public class Predmet {
    private int sifra;
    private String naziv;
    private int ESPB;

    public Predmet() {
    }

    public Predmet(int sifra, String naziv, int ESPB) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.ESPB = ESPB;
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getESPB() {
        return ESPB;
    }

    public void setESPB(int ESPB) {
        this.ESPB = ESPB;
    }

    @Override
    public String toString() {
        return  naziv;
    }
    
    
}
