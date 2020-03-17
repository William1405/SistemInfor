/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upb.tabd.ejb;

import java.util.List;
import javax.ejb.Local;
import upb.tabd.entidades.ControlPeso;

/**
 *
 * @author WilliamLeonardoAndra
 */
@Local
public interface ControlPesoFacadeLocal {

    void create(ControlPeso controlPeso);

    void edit(ControlPeso controlPeso);

    void remove(ControlPeso controlPeso);

    ControlPeso find(Object id);

    List<ControlPeso> findAll();

    List<ControlPeso> findRange(int[] range);

    int count();
    
}
