package ec.edu.ups.ejb;



import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidades.Restaurante;


@Stateless
public class RestauranteFacade extends AbstractFacade<Restaurante> {

    @PersistenceContext(unitName = "PeraltaBautista-Carlos-ExamenFinal")
    private EntityManager em;

    public RestauranteFacade() {
        super(Restaurante.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    
    
    
}

