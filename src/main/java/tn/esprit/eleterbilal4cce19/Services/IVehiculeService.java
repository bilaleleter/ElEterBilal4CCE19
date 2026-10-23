package tn.esprit.eleterbilal4cce19.Services;

import tn.esprit.eleterbilal4cce19.Domain.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule createVehicule(Vehicule vehicule);
    Vehicule updateVehicule(Vehicule vehicule);
    void deleteVehicule(Vehicule vehicule);
    Vehicule getVehiculeById(Long id);
    List<Vehicule> getAllVehicules();

}
