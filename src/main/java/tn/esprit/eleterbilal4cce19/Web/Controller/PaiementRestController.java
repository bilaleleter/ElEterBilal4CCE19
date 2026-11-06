package tn.esprit.eleterbilal4cce19.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.eleterbilal4cce19.Domain.Paiement;
import tn.esprit.eleterbilal4cce19.Services.Impls.PaiementService;

import java.util.List;
@Tag(name="Paiement", description = "Gestion Paiement")
@RequiredArgsConstructor
@RequestMapping("/paiements")
@RestController
public class PaiementRestController {
    private final PaiementService paiementService;

    @Operation(summary = "Ajouter Paiement")
    @PostMapping
    public Paiement add(@RequestBody Paiement paiement) {
        return paiementService.createPaiement(paiement);
    }
    @Operation(summary = "Recherche paiement par identifiant")
    @GetMapping("/{id}")
    public Paiement get(@PathVariable Long id) {
        return paiementService.getPaiementById(id);
    }

    @Operation(summary = "Modifier Paiement")
    @PutMapping
    public Paiement update(@RequestBody Paiement paiement) {
        return paiementService.updatePaiement(paiement);
    }

    @Operation(summary = "Supprimer Paiement")
    @DeleteMapping("/{id}")
    public void deletePaiement(@PathVariable Long id) {
        paiementService.deletePaiement(id);
    }

    @Operation(summary = "Afficher tous les Paiements")
    @GetMapping()
    public List<Paiement> getAllPaiements() {
        return paiementService.getAllPaiements();
    }

}
