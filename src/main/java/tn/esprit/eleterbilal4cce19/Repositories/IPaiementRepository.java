package tn.esprit.eleterbilal4cce19.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.eleterbilal4cce19.Domain.Maintenance;
import tn.esprit.eleterbilal4cce19.Domain.Paiement;

public interface IPaiementRepository extends JpaRepository<Paiement,Long> {
}
