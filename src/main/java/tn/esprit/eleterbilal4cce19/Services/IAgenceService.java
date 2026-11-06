package tn.esprit.eleterbilal4cce19.Services;

import tn.esprit.eleterbilal4cce19.Domain.Agence;

import java.util.List;

public interface IAgenceService {
    Agence createAgence(Agence agence);
    Agence updateAgence(Agence agence);
    void deleteAgence(Long id);
    Agence getAgenceById(Long id);
    List<Agence> getAllAgences();

}
