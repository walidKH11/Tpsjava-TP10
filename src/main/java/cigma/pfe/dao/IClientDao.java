package cigma.pfe.dao;

import cigma.pfe.models.Client;

public interface IClientDao {
    void save(Client c);
    Client update(Client c);
    void deleteById(long idClient);
    Client findById(long idClient);
}
