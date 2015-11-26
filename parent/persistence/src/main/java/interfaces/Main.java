package interfaces;

import interfaces.Implementation.ClientDAOImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by echerkas on 24.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceUnit");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();

//        New client name in DB

//        ClientPO notemployee = new ClientPO();
//        notemployee.setName("thirdPerson");
//        System.out.println("COMIITING");
//        em.persist(notemployee);
////        em.getTransaction().commit();
//        System.out.println("Done");
//
//        //New Tarif in DB
//
//        TarifPO newTarif = new TarifPO();
//        newTarif.setName("AnotherTarif");
//        newTarif.setPrice(12.00);
//        System.out.println("COMIITING");
//        em.persist(newTarif);
////        em.getTransaction().commit();
//        System.out.println("Done");
//
//        //New contract in DB (not working yet)
//
//        ContractPO newContract = new ContractPO();
//        newContract.getClient();
//        newContract.setClient(notemployee);
//        newContract.setNumber("666-333-666");
//        newContract.getTarif();
//        newContract.setTarif(newTarif);
//        System.out.println("COMIITING");
//        em.persist(newContract);
//        em.getTransaction().commit();
//        System.out.println("Done");

        //Find by name

        ClientDAOImpl make = new ClientDAOImpl(entityManager);
        make.findByName("Chandan");
//        entityManager.persist(make);
        entityManager.getTransaction().commit();
        System.out.println(make.findByName("Chandan").toString());
        System.out.println("Done");
        entityManager.close();
    }
}

        //Get all clients

//        ClientDAOImpl make = new ClientDAOImpl(entityManager);
//        make.getAll();
////                entityManager.persist(make);
//        entityManager.getTransaction().commit();
//        System.out.println(make.getAll().toString());
//        System.out.println("Done");
//        entityManager.close();
//    }
//}
//        ClientDAOImpl newPassword = new ClientDAOImpl(entityManager);
//        newPassword.findByName("Chandan");
//        entityManager.persist(newPassword);
//        entityManager.getTransaction().commit();
//        System.out.println(newPassword);
//        System.out.println("Done");
//        entityManager.close( );
//        entityManager.close( );


//    }
//        ClientDAOImpl clientDao = new ClientDAOImpl(factory);
//        clientDao.findByName("Katya");
//        System.out.println(clientDao);
//    }
