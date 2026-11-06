package tn.esprit.eleterbilal4cce19.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.eleterbilal4cce19.Domain.Equipement;
import tn.esprit.eleterbilal4cce19.Services.Impls.EquipementService;

import java.util.List;
@Tag(name="Equipement", description = "Gestion Equipement")
@RequiredArgsConstructor
@RequestMapping("/equipements")
@RestController
public class EquipementRestController {
    private final EquipementService equipementService;

    @Operation(summary = "Ajouter Equipement")
    @PostMapping
    public Equipement add(@RequestBody Equipement equipement) {
        return equipementService.createEquipement(equipement);
    }
    @Operation(summary = "Recherche equipement par identifiant")
    @GetMapping("/{id}")
    public Equipement get(@PathVariable Long id) {
        return equipementService.getEquipementById(id);
    }

    @Operation(summary = "Modifier Equipement")
    @PutMapping
    public Equipement update(@RequestBody Equipement equipement) {
        return equipementService.updateEquipement(equipement);
    }

    @Operation(summary = "Supprimer Equipement")
    @DeleteMapping("/{id}")
    public void deleteEquipement(@PathVariable Long id) {
        equipementService.deleteEquipement(id);
    }

    @Operation(summary = "Afficher tous les Equipements")
    @GetMapping()
    public List<Equipement> getAllEquipements() {
        return equipementService.getAllEquipements();
    }

}
