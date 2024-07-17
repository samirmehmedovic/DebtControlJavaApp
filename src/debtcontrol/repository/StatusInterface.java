/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package debtcontrol.repository;

import debtcontrol.model.Status;
import java.util.List;

/**
 *
 * @author podrska
 */
public interface StatusInterface {
    
    public Status vratiStatus(int racunId);
    
}
