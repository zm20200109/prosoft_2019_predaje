/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author Acer
 */
public class PoreskaStopa {
    private int sifra;
    private String naziv;
    private double iznos;

    public PoreskaStopa() {
    }

    public PoreskaStopa(int sifra, String naziv, double iznos) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.iznos = iznos;
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

    public double getIznos() {
        return iznos;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }

    @Override
    public String toString() {
        return naziv;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.sifra;
        hash = 67 * hash + Objects.hashCode(this.naziv);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.iznos) ^ (Double.doubleToLongBits(this.iznos) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PoreskaStopa other = (PoreskaStopa) obj;
        if (this.sifra != other.sifra) {
            return false;
        }
        if (Double.doubleToLongBits(this.iznos) != Double.doubleToLongBits(other.iznos)) {
            return false;
        }
        return Objects.equals(this.naziv, other.naziv);
    }
    
    
}
