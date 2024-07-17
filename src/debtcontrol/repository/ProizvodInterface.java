/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package debtcontrol.repository;

import debtcontrol.model.Proizvod;
import java.util.List;

/**
 *
 * @author podrska
 */
public interface ProizvodInterface {
    
    public List<Proizvod> listaProizvoda();
    public void dodajNoviProizvod(Proizvod proizvod);
    public void izbrisiProizvod (Proizvod proizvod);
    public void izmeniProizvod (Proizvod proizvod);
    public Proizvod pronadjiProizvod (int idProizvoda);
    public void dodajNaStanjeProizvoda (Proizvod proizvod, double kolicina);
    public void oduzmiSaStanjaProizvoda (Proizvod proizvod, double kolicina);
    
}
