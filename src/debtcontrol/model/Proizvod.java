/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debtcontrol.model;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author podrska
 */
public class Proizvod {
    
    private Integer idProizvoda;
    private String naziv;
    private double cena;
    private String jedinicaMere;
    private double kolicina;
    private List<Sastojak> sastojci;

    public Proizvod() {
    }

    public Proizvod(Integer idProizvoda, String naziv, double cena, String jedinicaMere, double kolicina, List<Sastojak> sastojci) {
        this.idProizvoda = idProizvoda;
        this.naziv = naziv;
        this.cena = cena;
        this.jedinicaMere = jedinicaMere;
        this.kolicina = kolicina;
        this.sastojci = sastojci;
    }

    public List<Sastojak> getSastojci() {
        return sastojci;
    }

    public void setSastojci(List<Sastojak> sastojci) {
        this.sastojci = sastojci;
    }

    public Integer getIdProizvoda() {
        return idProizvoda;
    }

    public void setIdProizvoda(Integer idProizvoda) {
        this.idProizvoda = idProizvoda;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getJedinicaMere() {
        return jedinicaMere;
    }

    public void setJedinicaMere(String jedinicaMere) {
        this.jedinicaMere = jedinicaMere;
    }

    public double getKolicina() {
        return kolicina;
    }

    public void setKolicina(double kolicina) {
        this.kolicina = kolicina;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Proizvod other = (Proizvod) obj;
        if (Double.doubleToLongBits(this.cena) != Double.doubleToLongBits(other.cena)) {
            return false;
        }
        if (Double.doubleToLongBits(this.kolicina) != Double.doubleToLongBits(other.kolicina)) {
            return false;
        }
        if (!Objects.equals(this.naziv, other.naziv)) {
            return false;
        }
        if (!Objects.equals(this.jedinicaMere, other.jedinicaMere)) {
            return false;
        }
        if (!Objects.equals(this.idProizvoda, other.idProizvoda)) {
            return false;
        }
        return Objects.equals(this.sastojci, other.sastojci);
    }

    @Override
    public String toString() {
        return "Proizvod{" + "idProizvoda: " + idProizvoda + ", naziv: " + naziv + ", cena: " + cena + ", jedinicaMere: " + jedinicaMere + ", kolicina: " + kolicina + ", sastojci: " + sastojci + '}';
    }

   
    
    
    
    
}
