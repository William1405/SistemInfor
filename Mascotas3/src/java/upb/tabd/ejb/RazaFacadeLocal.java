/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upb.tabd.ejb;

import java.util.List;
import javax.ejb.Local;
import upb.tabd.entidades.Raza;

/**
 *
 * @author WilliamLeonardoAndra
 */
@Local
public interface RazaFacadeLocal {

    void create(Raza raza);

    void edit(Raza raza);

    void remove(Raza raza);

    Raza find(Object id);

    List<Raza> findAll();

    List<Raza> findRange(int[] range);

    int count();
    
}
