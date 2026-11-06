package tn.esprit.eleterbilal4cce19.Services;

import tn.esprit.eleterbilal4cce19.Domain.Paiement;

import java.util.List;

public interface IPaiementService {
    Paiement createPaiement(Paiement paiement);
    Paiement updatePaiement(Paiement paiement);
    void deletePaiement(Long id);
    Paiement getPaiementById(Long id);
    List<Paiement> getAllPaiements();

}
