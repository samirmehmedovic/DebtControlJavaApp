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
public class StavkaRacuna {
    
    private int stavkaRacunaId;
    private double kolicina;
    private double cenaProizvoda;
    private double ukupno;
    private int racunId;
    private Proizvod proizvod;   
    

    public StavkaRacuna() {
    }

    public StavkaRacuna(int StavkaRacunaId, double kolicina, double cenaProizvoda, double ukupno, int racunId, Proizvod proizvod) {
        this.stavkaRacunaId = StavkaRacunaId;
        this.kolicina = kolicina;
        this.cenaProizvoda = cenaProizvoda;
        this.ukupno = ukupno;
        this.racunId = racunId;
        this.proizvod = proizvod;
    }

    public int getStavkaRacunaId() {
        return stavkaRacunaId;
    }

    public void setStavkaRacunaId(int StavkaRacunaId) {
        this.stavkaRacunaId = StavkaRacunaId;
    }

    public double getKolicina() {
        return kolicina;
    }

    public void setKolicina(double kolicina) {
        this.kolicina = kolicina;
    }

    public double getCenaProizvoda() {
        return cenaProizvoda;
    }

    public void setCenaProizvoda(double cenaProizvoda) {
        this.cenaProizvoda = cenaProizvoda;
    }

    public double getUkupno() {
        return ukupno;
    }

    public void setUkupno(double ukupno) {
        this.ukupno = ukupno;
    }

    public int getRacunId() {
        return racunId;
    }

    public void setRacunId(int racunId) {
        this.racunId = racunId;
    }

    public Proizvod getProizvod() {
        return proizvod;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
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
        final StavkaRacuna other = (StavkaRacuna) obj;
        if (this.stavkaRacunaId != other.stavkaRacunaId) {
            return false;
        }
        if (Double.doubleToLongBits(this.kolicina) != Double.doubleToLongBits(other.kolicina)) {
            return false;
        }
        if (Double.doubleToLongBits(this.cenaProizvoda) != Double.doubleToLongBits(other.cenaProizvoda)) {
            return false;
        }
        if (Double.doubleToLongBits(this.ukupno) != Double.doubleToLongBits(other.ukupno)) {
            return false;
        }
        if (this.racunId != other.racunId) {
            return false;
        }
        return Objects.equals(this.proizvod, other.proizvod);
    }

    @Override
    public String toString() {
        //return "StavkaRacuna{" + "StavkaRacunaId=" + stavkaRacunaId + ", kolicina=" + kolicina + ", cenaProizvoda=" + cenaProizvoda + ", ukupno=" + ukupno + ", racunId=" + racunId + ", proizvod=" + proizvod + '}';
     //       return "Stavka id "+stavkaRacunaId+ " kolicina = "+kolicina+ " cena = "+cenaProizvoda+ " ukupno = "+ukupno+ " proizvod je: " + proizvod.getNaziv()+" a broj racuna je: "+racunId;
     //       return " Proizvod : "+proizvod.getNaziv()+" "+" kom: "+kolicina+" "+" cena: "+cenaProizvoda+" "+" ukupno: "+ukupno+" \n";
    return "PROIZVOD: "+proizvod.getNaziv()+"   "+kolicina+"   X   "+cenaProizvoda+"   =   "+ukupno+" din"+"\n";
     //       return proizvod.getNaziv()+"               "+kolicina+"         "+cenaProizvoda+"       "+ukupno+"\n"; 
    }
    

    
    public String invoice(){
     
        
        return String.format("%-15s %15.2f %15.2f %15.2f", proizvod.getNaziv(), kolicina,cenaProizvoda,ukupno);
        
    }
    
    public String mail(){
        return "PROIZVOD: "+proizvod.getNaziv()+"   "+kolicina+"   X   "+cenaProizvoda+"   =  "+ukupno+"\n";
    }
    
}
