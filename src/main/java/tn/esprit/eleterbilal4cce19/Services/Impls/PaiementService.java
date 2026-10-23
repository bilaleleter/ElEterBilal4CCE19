package tn.esprit.eleterbilal4cce19.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.eleterbilal4cce19.Domain.Paiement;
import tn.esprit.eleterbilal4cce19.Repositories.IPaiementRepository;
import tn.esprit.eleterbilal4cce19.Services.IPaiementService;
import tn.esprit.eleterbilal4cce19.Services.IReservationService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PaiementService implements IPaiementService {
    private final IPaiementRepository paiementRepository;

    @Override
    public Paiement createPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public Paiement updatePaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public void deletePaiement(Paiement paiement) {
        paiementRepository.delete(paiement);
    }

    @Override
    public Paiement getPaiementById(Long id) {
        return paiementRepository.findById(id).orElse(null);
    }

    @Override
    public List<Paiement> getAllPaiements() {
        return paiementRepository.findAll();
    }
}
