package tn.esprit.eleterbilal4cce19.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.eleterbilal4cce19.Domain.Maintenance;
import tn.esprit.eleterbilal4cce19.Services.Impls.MaintenanceService;

import java.util.List;
@Tag(name="Maintenance", description = "Gestion Maintenance")
@RequiredArgsConstructor
@RequestMapping("/maintenances")
@RestController
public class MaintenanceRestController {
    private final MaintenanceService maintenanceService;

    @Operation(summary = "Ajouter Maintenance")
    @PostMapping
    public Maintenance add(@RequestBody Maintenance maintenance) {
        return maintenanceService.createMaintenance(maintenance);
    }
    @Operation(summary = "Recherche maintenance par identifiant")
    @GetMapping("/{id}")
    public Maintenance get(@PathVariable Long id) {
        return maintenanceService.getMaintenanceById(id);
    }

    @Operation(summary = "Modifier Maintenance")
    @PutMapping
    public Maintenance update(@RequestBody Maintenance maintenance) {
        return maintenanceService.updateMaintenance(maintenance);
    }

    @Operation(summary = "Supprimer Maintenance")
    @DeleteMapping("/{id}")
    public void deleteMaintenance(@PathVariable Long id) {
        maintenanceService.deleteMaintenance(id);
    }

    @Operation(summary = "Afficher tous les Maintenances")
    @GetMapping()
    public List<Maintenance> getAllMaintenances() {
        return maintenanceService.getAllMaintenances();
    }

}
