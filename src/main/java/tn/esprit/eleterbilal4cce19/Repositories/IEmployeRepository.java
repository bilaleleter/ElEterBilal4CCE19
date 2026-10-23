package tn.esprit.eleterbilal4cce19.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.eleterbilal4cce19.Domain.Employe;

public interface IEmployeRepository extends JpaRepository<Employe,Long> {
}
