/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package debtcontrol.repository;

import debtcontrol.model.Korisnik;
import debtcontrol.model.Proizvod;
import debtcontrol.model.Racun;
import debtcontrol.model.Status;
import java.util.List;

/**
 *
 * @author podrska
 */
public interface RacunInterface {
 
     public List<Racun> listaRacuna();
    public void dodajRacun(Racun racun);
    public void izbrisiRacun (Racun racun);
    public void izmeniRacun (Racun racun);
    public Racun pronadjiRacun (String imeKorisnika, int racunId, String emailKorinika);
    public int dodajRacunIvratiId(Racun racun);
    public List<Racun> listaRacuna(Korisnik k, Status s);
     public List<Racun> listaRacunaPlaceni(Korisnik k);
     public Racun vratiRacunStatusa (Status s);
     public void platiRacun(int racunId);
     public List<Racun> listaRacuna(Korisnik k);
     public List<Racun> listaRacunaSvihStatusa (Korisnik k, Status s);
     public void stornirajRacun(Racun r);
     public void izbrsiPrazneRacune();
    public List<Racun> listaRacunaStatusa();
      public List<Racun> listaRacunaStatusa(Status s);
      public double ukupanIznozSvihRacuna();
}
