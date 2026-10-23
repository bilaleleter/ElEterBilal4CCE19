package tn.esprit.eleterbilal4cce19.Services;

import tn.esprit.eleterbilal4cce19.Domain.Client;

import java.util.List;

public interface IClientService {
    Client createClient(Client client);
    Client updateClient(Client client);
    void deleteClient(Client client);
    Client getClientById(Long id);
    List<Client> getAllClients();
}
