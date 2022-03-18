package cigma.pfe.services;

import cigma.pfe.models.Client;

public interface IClientService {
    void save(Client c);
    Client modify(Client c);
    void removeById(long id);
    Client getById(long id);
}
