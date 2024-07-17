/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debtcontrol.model;

import java.util.Objects;

/**
 *
 * @author podrska
 */
public class Sastojak {
    
    private int sastojakId;
    private Proizvod proizvod;
    private double kolicina;
    private JedinicaMere jedinicaMere;

    public Sastojak() {
    }

    public Sastojak(int sastojakId, Proizvod proizvod, double kolicina, JedinicaMere jedinicaMere) {
        this.sastojakId = sastojakId;
        this.proizvod = proizvod;
        this.kolicina = kolicina;
        this.jedinicaMere = jedinicaMere;
    }

    public JedinicaMere getJedinicaMere() {
        return jedinicaMere;
    }

    public void setJedinicaMere(JedinicaMere jedinicaMere) {
        this.jedinicaMere = jedinicaMere;
    }

    public int getSastojakId() {
        return sastojakId;
    }

    public void setSastojakId(int sastojakId) {
        this.sastojakId = sastojakId;
    }

    public Proizvod getProizvod() {
        return proizvod;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    public double getKolicina() {
        return kolicina;
    }

    public void setKolicina(double kolicina) {
        this.kolicina = kolicina;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Sastojak other = (Sastojak) obj;
        if (this.sastojakId != other.sastojakId) {
            return false;
        }
        if (Double.doubleToLongBits(this.kolicina) != Double.doubleToLongBits(other.kolicina)) {
            return false;
        }
        if (!Objects.equals(this.proizvod, other.proizvod)) {
            return false;
        }
        return this.jedinicaMere == other.jedinicaMere;
    }

    @Override
    public String toString() {
        return "Sastojak{" + "sastojakId=" + sastojakId + ", proizvod=" + proizvod + ", kolicina=" + kolicina + ", jedinicaMere=" + jedinicaMere + '}';
    }
           
    
}
