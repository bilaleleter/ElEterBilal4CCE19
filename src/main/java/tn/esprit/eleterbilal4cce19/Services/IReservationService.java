package tn.esprit.eleterbilal4cce19.Services;

import tn.esprit.eleterbilal4cce19.Domain.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation createReservation(Reservation reservation);
    Reservation updateReservation(Reservation reservation);
    void deleteReservation(Reservation reservation);
    Reservation getReservationById(Long id);
    List<Reservation> getAllReservations();
}
