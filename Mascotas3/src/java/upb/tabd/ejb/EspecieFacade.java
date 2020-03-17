/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upb.tabd.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import upb.tabd.entidades.Especie;

/**
 *
 * @author WilliamLeonardoAndra
 */
@Stateless
public class EspecieFacade extends AbstractFacade<Especie> implements EspecieFacadeLocal {

    @PersistenceContext(unitName = "Mascotas3PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EspecieFacade() {
        super(Especie.class);
    }
    
}
