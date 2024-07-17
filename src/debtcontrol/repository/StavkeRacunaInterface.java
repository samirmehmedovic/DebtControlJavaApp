/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package debtcontrol.repository;

import debtcontrol.model.Proizvod;
import debtcontrol.model.Racun;
import debtcontrol.model.StavkaRacuna;
import java.util.List;

/**
 *
 * @author podrska
 */
public interface StavkeRacunaInterface {
     public List<StavkaRacuna> listaStavkaRacuna();
    public void dodajStavkaRacuna(StavkaRacuna stavka);
    public void izbrisiStavkuRacuna (Proizvod proizvod);
    public void izmeniStavkuRacuna (StavkaRacuna sr);
    public StavkaRacuna pronadjiStavkuRacuna (int stavkaId);
    public List<StavkaRacuna>stavkePoRacunu(int racunId);
}
