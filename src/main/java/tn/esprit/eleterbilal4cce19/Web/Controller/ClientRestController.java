package tn.esprit.eleterbilal4cce19.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.eleterbilal4cce19.Domain.Client;
import tn.esprit.eleterbilal4cce19.Services.Impls.ClientService;

import java.util.List;
@Tag(name="Client", description = "Gestion Client")
@RequiredArgsConstructor
@RequestMapping("/clients")
@RestController
public class ClientRestController {
    private final ClientService clientService;

    @Operation(summary = "Ajouter Client")
    @PostMapping
    public Client add(@RequestBody Client client) {
        return clientService.createClient(client);
    }
    @Operation(summary = "Recherche client par identifiant")
    @GetMapping("/{id}")
    public Client get(@PathVariable Long id) {
        return clientService.getClientById(id);
    }

    @Operation(summary = "Modifier Client")
    @PutMapping
    public Client update(@RequestBody Client client) {
        return clientService.updateClient(client);
    }

    @Operation(summary = "Supprimer Client")
    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }

    @Operation(summary = "Afficher tous les Clients")
    @GetMapping()
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

}
