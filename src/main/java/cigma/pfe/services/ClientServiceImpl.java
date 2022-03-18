package cigma.pfe.services;

import cigma.pfe.dao.IClientDao;
import cigma.pfe.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClientServiceImpl implements IClientService {
    @Autowired
    private IClientDao dao;

    public ClientServiceImpl() {
        System.out.println("creation bean service");
    }

    public ClientServiceImpl(IClientDao dao) {
        this.dao = dao;
    }
    @Override
    public void save(Client c) {
       dao.save(c);
    }

    @Override
    public Client modify(Client c) {
        return dao.update(c);
    }

    @Override
    public void removeById(long id) {
        dao.deleteById(id);
    }

    @Override
    public Client getById(long id) {
        return dao.findById(id);
    }

}
