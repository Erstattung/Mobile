package interfaces.Implementation;

import interfaces.GenericDAOImpl;
import interfaces.PO.TarifPO;

/**
 * Created by echerkas on 24.11.2015.
 */
public class TarifDAOImpl extends GenericDAOImpl <TarifPO> {
    public TarifPO findByName (String name){
        return entityManager.createQuery("SELECT c from TarifPO c WHERE " +
                "c.name = :name", TarifPO.class)
                .setParameter("name", name).getSingleResult();
    }
    public TarifPO findById (long id){
        return entityManager.createQuery("SELECT c from TarifPO c WHERE " +
                "c.id = :id", TarifPO.class)
                .setParameter("id", id).getSingleResult();
    }
}
