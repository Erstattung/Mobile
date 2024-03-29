package interfaces.Implementation;

import interfaces.GenericDAOImpl;
import interfaces.PO.TarifPO;
import javax.persistence.EntityManager;

/**
 * Created by echerkas on 24.11.2015.
 */
public class TarifDAOImpl extends GenericDAOImpl<TarifPO> {

    public TarifDAOImpl(EntityManager entityManager) {
        super(entityManager);
    }

    public TarifPO findByName (String name){
        return entityManager.createQuery("SELECT c from TarifPO c WHERE " +
                "c.name = :name", TarifPO.class)
                .setParameter("name", name).getSingleResult();
    }
}
