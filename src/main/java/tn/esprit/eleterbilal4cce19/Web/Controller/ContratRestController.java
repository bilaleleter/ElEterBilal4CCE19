package tn.esprit.eleterbilal4cce19.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.eleterbilal4cce19.Domain.Contrat;
import tn.esprit.eleterbilal4cce19.Services.Impls.ContratService;

import java.util.List;
@Tag(name="Contrat", description = "Gestion Contrat")
@RequiredArgsConstructor
@RequestMapping("/contrats")
@RestController
public class ContratRestController {
    private final ContratService contratService;

    @Operation(summary = "Ajouter Contrat")
    @PostMapping
    public Contrat add(@RequestBody Contrat contrat) {
        return contratService.createContrat(contrat);
    }
    @Operation(summary = "Recherche contrat par identifiant")
    @GetMapping("/{id}")
    public Contrat get(@PathVariable Long id) {
        return contratService.getContratById(id);
    }

    @Operation(summary = "Modifier Contrat")
    @PutMapping
    public Contrat update(@RequestBody Contrat contrat) {
        return contratService.updateContrat(contrat);
    }

    @Operation(summary = "Supprimer Contrat")
    @DeleteMapping("/{id}")
    public void deleteContrat(@PathVariable Long id) {
        contratService.deleteContrat(id);
    }

    @Operation(summary = "Afficher tous les Contrats")
    @GetMapping()
    public List<Contrat> getAllContrats() {
        return contratService.getAllContrats();
    }

}
