package tn.esprit.eleterbilal4cce19.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.eleterbilal4cce19.Domain.Employe;
import tn.esprit.eleterbilal4cce19.Services.Impls.EmployeService;

import java.util.List;
@Tag(name="Employe", description = "Gestion Employe")
@RequiredArgsConstructor
@RequestMapping("/employes")
@RestController
public class EmployeRestController {
    private final EmployeService employeService;

    @Operation(summary = "Ajouter Employe")
    @PostMapping
    public Employe add(@RequestBody Employe employe) {
        return employeService.createEmploye(employe);
    }
    @Operation(summary = "Recherche employe par identifiant")
    @GetMapping("/{id}")
    public Employe get(@PathVariable Long id) {
        return employeService.getEmployeById(id);
    }

    @Operation(summary = "Modifier Employe")
    @PutMapping
    public Employe update(@RequestBody Employe employe) {
        return employeService.updateEmploye(employe);
    }

    @Operation(summary = "Supprimer Employe")
    @DeleteMapping("/{id}")
    public void deleteEmploye(@PathVariable Long id) {
        employeService.deleteEmploye(id);
    }

    @Operation(summary = "Afficher tous les Employes")
    @GetMapping()
    public List<Employe> getAllEmployes() {
        return employeService.getAllEmployes();
    }

}
