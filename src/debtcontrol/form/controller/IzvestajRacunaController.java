/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debtcontrol.form.controller;

import debtcontrol.form.IzvestajRacunaForm;
import debtcontrol.model.Racun;
import debtcontrol.model.Status;
import debtcontrol.repository.RacunInterface;
import debtcontrol.repositoryImpl.RacunInterfaceImpl;
import debtcontrol.table.TabelaRacun;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

/**
 *
 * @author podrska
 */
public class IzvestajRacunaController {
    
        public static void izvestajNeplacenihRacuna (JTable tblIzvestajRacuna, JTextField txtUkupno, JLabel lblFinansijskiIzvestaj){
         RacunInterface racunInterface = new RacunInterfaceImpl();
         double ukupno;
        
        
        List<Racun> racuni = racunInterface.listaRacunaStatusa(Status.AKTIVAN_NEPLACEN);

        TableModel tm = new TabelaRacun(racuni);

        ukupno = 0;
        for (Racun r : racuni) {
            ukupno = ukupno + r.getUkupno();
        }

        txtUkupno.setText(String.valueOf(ukupno));

        tblIzvestajRacuna.setModel(tm);
        tblIzvestajRacuna.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());
        tblIzvestajRacuna.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(tblIzvestajRacuna));

        lblFinansijskiIzvestaj.setText("Ukupno zaduženje po svim AKTIVNIM-NEPLAĆENIM računima iznosi: ");
        lblFinansijskiIzvestaj.setVisible(true);
        txtUkupno.setVisible(true);
        
       
        
    }
    
    
     public static void izvestajRacuna (JTable tblIzvestajRacuna, JTextField txtUkupno, JLabel lblFinansijskiIzvestaj, Status status){
         
           RacunInterface racunInterface = new RacunInterfaceImpl();
         double ukupno;
        
         
        
         
         if (String.valueOf(status).equals("AKTIVAN_NEPLACEN")){
         
         
       
        
        List<Racun> racuni = racunInterface.listaRacunaStatusa(Status.AKTIVAN_NEPLACEN);

        TableModel tm = new TabelaRacun(racuni);

        ukupno = 0;
        for (Racun r : racuni) {
            ukupno = ukupno + r.getUkupno();
        }

        txtUkupno.setText(String.valueOf(ukupno));

        tblIzvestajRacuna.setModel(tm);
        tblIzvestajRacuna.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());
        tblIzvestajRacuna.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(tblIzvestajRacuna));

        lblFinansijskiIzvestaj.setText("Ukupno zaduženje po svim AKTIVNIM-NEPLAĆENIM računima iznosi: ");
        lblFinansijskiIzvestaj.setVisible(true);
        txtUkupno.setVisible(true);
        
         }else if(String.valueOf(status).equals("STORNIRAN_GRESKA")){
             
             List<Racun> racuni = racunInterface.listaRacunaStatusa(Status.STORNIRAN_GRESKA);

        TableModel tm = new TabelaRacun(racuni);
        ukupno = 0;
        for (Racun r : racuni) {
            ukupno = ukupno + r.getUkupno();
        }

        txtUkupno.setText(String.valueOf(ukupno));

        tblIzvestajRacuna.setModel(tm);
        tblIzvestajRacuna.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());
        tblIzvestajRacuna.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(tblIzvestajRacuna));

        lblFinansijskiIzvestaj.setText("Ukupno zaduženje po svim STORNIRANIM računima iznosi: ");
        lblFinansijskiIzvestaj.setVisible(true);
        txtUkupno.setVisible(true);
             
         } else if(String.valueOf(status).equals("NEAKTIVAN_PLACEN")){
                  List<Racun> racuni = racunInterface.listaRacunaStatusa(Status.NEAKTIVAN_PLACEN);

        TableModel tm = new TabelaRacun(racuni);
        ukupno = 0;
        for (Racun r : racuni) {
            ukupno = ukupno + r.getUkupno();
        }

        txtUkupno.setText(String.valueOf(ukupno));
        tblIzvestajRacuna.setModel(tm);
        tblIzvestajRacuna.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());
        tblIzvestajRacuna.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(tblIzvestajRacuna));

        lblFinansijskiIzvestaj.setText("Ukupno zaduženje po svim NEAKTIVNIM-PLAĆENIM računima iznosi: ");
        lblFinansijskiIzvestaj.setVisible(true);
        txtUkupno.setVisible(true);
             
         }
        
        
     }
     
     public static void listaSvihRacuna(JTable tblIzvestajRacuna, JTextField txtUkupno, JLabel lblFinansijskiIzvestaj){
         
          RacunInterface racunInterface = new RacunInterfaceImpl();
         double ukupno;
          
          
          List<Racun> racuni = racunInterface.listaRacuna();

        TableModel tm = new TabelaRacun(racuni);
        ukupno = 0;
        for (Racun r : racuni) {
            ukupno = ukupno + r.getUkupno();
        }

        txtUkupno.setText(String.valueOf(ukupno));
        tblIzvestajRacuna.setModel(tm);
        tblIzvestajRacuna.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());
        tblIzvestajRacuna.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(tblIzvestajRacuna));

        lblFinansijskiIzvestaj.setVisible(false);
        txtUkupno.setVisible(false);
     }
     
     public static void listaStorniranihRacuna(JTable tblIzvestajRacuna, JTextField txtUkupno, JLabel lblFinansijskiIzvestaj){
        RacunInterface racunInterface = new RacunInterfaceImpl();
         double ukupno;
         
         List<Racun> racuni = racunInterface.listaRacunaStatusa(Status.STORNIRAN_GRESKA);

        TableModel tm = new TabelaRacun(racuni);
        ukupno = 0;
        for (Racun r : racuni) {
            ukupno = ukupno + r.getUkupno();
        }

        txtUkupno.setText(String.valueOf(ukupno));

        tblIzvestajRacuna.setModel(tm);
        tblIzvestajRacuna.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());
        tblIzvestajRacuna.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(tblIzvestajRacuna));

        lblFinansijskiIzvestaj.setText("Ukupno zaduženje po svim STORNIRANIM računima iznosi: ");
        lblFinansijskiIzvestaj.setVisible(true);
        txtUkupno.setVisible(true);
     }
    
    
     public static void listaPlacenihRacuna(JTable tblIzvestajRacuna, JTextField txtUkupno, JLabel lblFinansijskiIzvestaj){
         RacunInterface racunInterface = new RacunInterfaceImpl();
         double ukupno;
           List<Racun> racuni = racunInterface.listaRacunaStatusa(Status.NEAKTIVAN_PLACEN);

        TableModel tm = new TabelaRacun(racuni);
        ukupno = 0;
        for (Racun r : racuni) {
            ukupno = ukupno + r.getUkupno();
        }

        txtUkupno.setText(String.valueOf(ukupno));
        tblIzvestajRacuna.setModel(tm);
        tblIzvestajRacuna.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());
        tblIzvestajRacuna.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(tblIzvestajRacuna));

        lblFinansijskiIzvestaj.setText("Ukupno zaduženje po svim NEAKTIVNIM-PLAĆENIM računima iznosi: ");
        lblFinansijskiIzvestaj.setVisible(true);
        txtUkupno.setVisible(true);
         
     }


    
}
