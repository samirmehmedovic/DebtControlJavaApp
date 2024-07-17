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
public class Korisnik {

    private int idKorisnik;
    private String ime;
    private String prezime;
    private String email;
    private boolean mailObavestenja;

    public Korisnik() {
    }

    public Korisnik(int idKorisnik, String ime, String prezime, String email, boolean mailObavestenja) {
        this.idKorisnik = idKorisnik;
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.mailObavestenja = mailObavestenja;
    }

    public int getIdKorisnik() {
        return idKorisnik;
    }

    public void setIdKorisnik(int idKorisnik) {
        this.idKorisnik = idKorisnik;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getMail() {
        return email;
    }

    public void setMail(String mail) {
        this.email = mail;
    }

    public boolean isMailObavestenja() {
        return mailObavestenja;
    }

    public void setMailObavestenja(boolean mailObavestenja) {
        this.mailObavestenja = mailObavestenja;
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
        final Korisnik other = (Korisnik) obj;
        if (this.idKorisnik != other.idKorisnik) {
            return false;
        }
        if (this.mailObavestenja != other.mailObavestenja) {
            return false;
        }
        if (!Objects.equals(this.ime, other.ime)) {
            return false;
        }
        if (!Objects.equals(this.prezime, other.prezime)) {
            return false;
        }
        return Objects.equals(this.email, other.email);
    }

    @Override
    public String toString() {
        return "Korisnik{" + "idKorisnik: " + idKorisnik + ", ime: " + ime + ", prezime: "  + prezime + ", mail: " + email + ", mailObavestenja: " + mailObavestenja + '}';
    }

    
    
    

    
    
}
