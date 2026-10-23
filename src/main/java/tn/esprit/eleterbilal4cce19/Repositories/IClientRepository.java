package tn.esprit.eleterbilal4cce19.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.eleterbilal4cce19.Domain.Agence;
import tn.esprit.eleterbilal4cce19.Domain.Client;

public interface IClientRepository extends JpaRepository<Client,Long> {
}
