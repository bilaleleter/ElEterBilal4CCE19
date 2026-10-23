package tn.esprit.eleterbilal4cce19.Services;

import tn.esprit.eleterbilal4cce19.Domain.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    Maintenance createMaintenance(Maintenance maintenance);
    Maintenance updateMaintenance(Maintenance maintenance);
    void deleteMaintenance(Maintenance maintenance);
    Maintenance getMaintenanceById(Long id);
    List<Maintenance> getAllMaintenances();
}
