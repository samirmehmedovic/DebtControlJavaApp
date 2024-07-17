/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debtcontrol.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author podrska
 */
public class Racun {
    
    private int idRacuna;
    private LocalDate datum;
    private Korisnik korisnik;
    private List<StavkaRacuna> stavke;
     private double ukupno;  
    private Status status;

    public Racun() {
    }

    public Racun(int idRacuna, LocalDate datum, List<StavkaRacuna> stavke, double ukupno, Korisnik korisnik, Status status) {
        this.idRacuna = idRacuna;
        this.datum = datum;
        this.stavke = stavke;
        this.ukupno = ukupno;
        this.korisnik = korisnik;
        this.status = status;
    }

    

    public double getUkupno() {
        return ukupno;
    }

    public void setUkupno(double ukupno) {
        this.ukupno = ukupno;
    }

    public int getIdRacuna() {
        return idRacuna;
    }

    public void setIdRacuna(int idRacuna) {
        this.idRacuna = idRacuna;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public List<StavkaRacuna> getStavke() {
        return stavke;
    }

    public void setStavke(List<StavkaRacuna> stavke) {
        this.stavke = stavke;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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
        final Racun other = (Racun) obj;
        if (this.idRacuna != other.idRacuna) {
            return false;
        }
        if (Double.doubleToLongBits(this.ukupno) != Double.doubleToLongBits(other.ukupno)) {
            return false;
        }
        if (!Objects.equals(this.datum, other.datum)) {
            return false;
        }
        if (!Objects.equals(this.stavke, other.stavke)) {
            return false;
        }
        if (!Objects.equals(this.korisnik, other.korisnik)) {
            return false;
        }
        return this.status == other.status;
    }

    @Override
    public String toString() {
        return "Racun{" + "idRacuna=" + idRacuna + ", datum=" + datum + ", ukupno=" + ukupno + ", stavke=" + stavke + ", korisnik=" + korisnik + ", status=" + status + '}';
    }

   

    
    
}
