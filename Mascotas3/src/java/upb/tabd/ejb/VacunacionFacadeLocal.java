/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upb.tabd.ejb;

import java.util.List;
import javax.ejb.Local;
import upb.tabd.entidades.Vacunacion;

/**
 *
 * @author WilliamLeonardoAndra
 */
@Local
public interface VacunacionFacadeLocal {

    void create(Vacunacion vacunacion);

    void edit(Vacunacion vacunacion);

    void remove(Vacunacion vacunacion);

    Vacunacion find(Object id);

    List<Vacunacion> findAll();

    List<Vacunacion> findRange(int[] range);

    int count();
    
}
