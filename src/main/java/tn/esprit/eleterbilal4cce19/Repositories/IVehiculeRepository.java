package tn.esprit.eleterbilal4cce19.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.eleterbilal4cce19.Domain.Vehicule;

public interface IVehiculeRepository extends JpaRepository<Vehicule,Long> {
}
