package tn.esprit.eleterbilal4cce19.Services;

import tn.esprit.eleterbilal4cce19.Domain.Agence;

import java.util.List;

public interface IAgenceService {
    Agence createAgence(Agence ag);
    Agence updateAgence(Agence ag);
    void deleteAgence(Agence ag);
    List<Agence> getAllAgences();
    Agence getAgenceById(Long id);
}
