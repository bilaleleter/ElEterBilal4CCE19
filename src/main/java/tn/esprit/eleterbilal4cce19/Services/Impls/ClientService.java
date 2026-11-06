package tn.esprit.eleterbilal4cce19.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.eleterbilal4cce19.Domain.Client;
import tn.esprit.eleterbilal4cce19.Repositories.IClientRepository;
import tn.esprit.eleterbilal4cce19.Services.IClientService;

import java.util.List;
@RequiredArgsConstructor
@Service
public class ClientService implements IClientService {

    private final IClientRepository clientRepository;


    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
