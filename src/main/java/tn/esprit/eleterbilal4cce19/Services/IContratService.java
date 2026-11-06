package tn.esprit.eleterbilal4cce19.Services;

import tn.esprit.eleterbilal4cce19.Domain.Contrat;

import java.util.List;

public interface IContratService {
    Contrat createContrat(Contrat contrat);
    Contrat updateContrat(Contrat contrat);
    void deleteContrat(Long id);
    Contrat getContratById(Long id);
    List<Contrat> getAllContrats();

}
