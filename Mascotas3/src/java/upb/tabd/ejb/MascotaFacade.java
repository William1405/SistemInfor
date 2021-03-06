/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upb.tabd.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import upb.tabd.entidades.Mascota;

/**
 *
 * @author WilliamLeonardoAndra
 */
@Stateless
public class MascotaFacade extends AbstractFacade<Mascota> implements MascotaFacadeLocal {

    @PersistenceContext(unitName = "Mascotas3PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MascotaFacade() {
        super(Mascota.class);
    }
    
}
