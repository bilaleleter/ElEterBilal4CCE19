package tn.esprit.eleterbilal4cce19.Services;

import tn.esprit.eleterbilal4cce19.Domain.Equipement;

import java.util.List;

public interface IEquipementService {
    Equipement createEquipement(Equipement equipement);
    Equipement updateEquipement(Equipement equipement);
    void deleteEquipement(Equipement equipement);
    Equipement getEquipementById(Long id);
    List<Equipement> getAllEquipements();
}
