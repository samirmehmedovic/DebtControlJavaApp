/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package debtcontrol.repository;

import debtcontrol.model.Korisnik;
import java.util.List;

/**
 *
 * @author podrska
 */
public interface KorisnikInterface {
    
    
    public List<Korisnik> listaKorisnika();
    public void dodajKorisnika(Korisnik k);
    public void izbrisiKorisnika(Korisnik k);
    public void izmeniKorisnika (Korisnik k);
    public Korisnik pronadjiKorisnika (String email, String ime);
    public Korisnik pronadjiKorisnika (int racunId);
    public List<Korisnik> listaAktivnihKorisnika(); 
    
    
}
