package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("ctrl1")
public class ClientController {
    @Autowired
    private IClientService service ;

    public ClientController() {
        System.out.println("creation bean controller");
    }

    public ClientController(IClientService service) {
        this.service = service;
    }
    public void save(Client c){
        service.save(c);
    }
    public void modify(Client c){
        service.modify(c);
    }

    public void removeById(long id){
        service.removeById(id);
    }

    public Client getById(long id){
        return service.getById(id);
    }
}
