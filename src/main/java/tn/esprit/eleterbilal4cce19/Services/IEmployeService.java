package tn.esprit.eleterbilal4cce19.Services;

import tn.esprit.eleterbilal4cce19.Domain.Employe;

import java.util.List;

public interface IEmployeService {
    Employe createEmploye(Employe employe);
    Employe updateEmploye(Employe employe);
    void deleteEmploye(Employe employe);
    Employe getEmployeById(Long id);
    List<Employe> getAllEmployes();
}
