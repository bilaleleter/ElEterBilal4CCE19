package tn.esprit.eleterbilal4cce19.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.eleterbilal4cce19.Domain.Reservation;
import tn.esprit.eleterbilal4cce19.Services.Impls.ReservationService;

import java.util.List;
@Tag(name="Reservation", description = "Gestion Reservation")
@RequiredArgsConstructor
@RequestMapping("/reservations")
@RestController
public class ReservationRestController {
    private final ReservationService reservationService;

    @Operation(summary = "Ajouter Reservation")
    @PostMapping
    public Reservation add(@RequestBody Reservation reservation) {
        return reservationService.createReservation(reservation);
    }
    @Operation(summary = "Recherche reservation par identifiant")
    @GetMapping("/{id}")
    public Reservation get(@PathVariable Long id) {
        return reservationService.getReservationById(id);
    }

    @Operation(summary = "Modifier Reservation")
    @PutMapping
    public Reservation update(@RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }

    @Operation(summary = "Supprimer Reservation")
    @DeleteMapping("/{id}")
    public void deleteReservation(@PathVariable Long id) {
        reservationService.deleteReservation(id);
    }

    @Operation(summary = "Afficher tous les Reservations")
    @GetMapping()
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

}
