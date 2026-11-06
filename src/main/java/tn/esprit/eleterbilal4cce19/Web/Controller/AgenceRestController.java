package tn.esprit.eleterbilal4cce19.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.eleterbilal4cce19.Domain.Agence;
import tn.esprit.eleterbilal4cce19.Services.Impls.AgenceService;

import java.util.List;
@Tag(name="Agence", description = "Gestion Agence")
@RequiredArgsConstructor
@RequestMapping("/agences")
@RestController
public class AgenceRestController {
    private final AgenceService agenceService;

    @Operation(summary = "Ajouter Agence")
    @PostMapping
    public Agence add(@RequestBody Agence agence) {
        return agenceService.createAgence(agence);
    }
    @Operation(summary = "Recherche agence par identifiant")
    @GetMapping("/{id}")
    public Agence get(@PathVariable Long id) {
        return agenceService.getAgenceById(id);
    }

    @Operation(summary = "Modifier Agence")
    @PutMapping
    public Agence update(@RequestBody Agence agence) {
        return agenceService.updateAgence(agence);
    }

    @Operation(summary = "Supprimer Agence")
    @DeleteMapping("/{id}")
    public void deleteAgence(@PathVariable Long id) {
        agenceService.deleteAgence(id);
    }

    @Operation(summary = "Afficher tous les Agences")
    @GetMapping()
    public List<Agence> getAllAgences() {
        return agenceService.getAllAgences();
    }

}
