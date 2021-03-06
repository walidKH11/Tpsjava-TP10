package cigma.pfe.dao;

import cigma.pfe.models.Client;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ClientDaoImpl implements IClientDao {
    @PersistenceContext
    private EntityManager em;

    public ClientDaoImpl() {
        System.out.println("creation bean dao");
    }

    @Override
    public void save(Client c) {
        em.persist(c);
    }

    @Override
    public Client update(Client newClient) {
        em.getTransaction().begin();
        Client currentClient =
                em.find(Client.class,newClient.getId());
        currentClient.setName(newClient.getName());
        em.persist(currentClient);
        em.getTransaction().commit();
        return null;
    }

    @Override
    public void deleteById(long idClient) {
        em.getTransaction().begin();
        Client clientInDataBase = em.find(Client.class,idClient);
        em.remove(clientInDataBase);
        em.getTransaction().commit();
    }

    @Override
    public Client findById(long idClient) {
        return em.find(Client.class,idClient);
    }

}
