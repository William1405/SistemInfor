/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upb.tabd.ejb;

import java.util.List;
import javax.ejb.Local;
import upb.tabd.entidades.Especie;

/**
 *
 * @author WilliamLeonardoAndra
 */
@Local
public interface EspecieFacadeLocal {

    void create(Especie especie);

    void edit(Especie especie);

    void remove(Especie especie);

    Especie find(Object id);

    List<Especie> findAll();

    List<Especie> findRange(int[] range);

    int count();
    
}
