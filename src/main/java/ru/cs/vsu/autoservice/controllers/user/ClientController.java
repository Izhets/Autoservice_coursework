package ru.cs.vsu.autoservice.controllers.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.cs.vsu.autoservice.model.dto.request.user.ClientCreateRequest;
import ru.cs.vsu.autoservice.service.user.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public ClientCreateRequest addClient(@RequestBody ClientCreateRequest clientCreateRequest){
        return clientService.createClient(clientCreateRequest);
    }

}
