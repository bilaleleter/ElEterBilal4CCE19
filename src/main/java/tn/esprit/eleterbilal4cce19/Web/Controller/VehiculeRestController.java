package tn.esprit.eleterbilal4cce19.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.eleterbilal4cce19.Domain.Vehicule;
import tn.esprit.eleterbilal4cce19.Services.Impls.VehiculeService;

import java.util.List;
@Tag(name="Vehicule", description = "Gestion Vehicule")
@RequiredArgsConstructor
@RequestMapping("/vehicules")
@RestController
public class VehiculeRestController {
    private final VehiculeService vehiculeService;

    @Operation(summary = "Ajouter Vehicule")
    @PostMapping
    public Vehicule add(@RequestBody Vehicule vehicule) {
        return vehiculeService.createVehicule(vehicule);
    }
    @Operation(summary = "Recherche vehicule par identifiant")
    @GetMapping("/{id}")
    public Vehicule get(@PathVariable Long id) {
        return vehiculeService.getVehiculeById(id);
    }

    @Operation(summary = "Modifier Vehicule")
    @PutMapping
    public Vehicule update(@RequestBody Vehicule vehicule) {
        return vehiculeService.updateVehicule(vehicule);
    }

    @Operation(summary = "Supprimer Vehicule")
    @DeleteMapping("/{id}")
    public void deleteVehicule(@PathVariable Long id) {
        vehiculeService.deleteVehicule(id);
    }

    @Operation(summary = "Afficher tous les vehicules")
    @GetMapping()
    public List<Vehicule> getAllVehicules() {
        return vehiculeService.getAllVehicules();
    }

}