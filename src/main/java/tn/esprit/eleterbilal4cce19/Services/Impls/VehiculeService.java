package tn.esprit.eleterbilal4cce19.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.eleterbilal4cce19.Domain.Vehicule;
import tn.esprit.eleterbilal4cce19.Repositories.IVehiculeRepository;
import tn.esprit.eleterbilal4cce19.Services.IVehiculeService;

import java.util.List;
@RequiredArgsConstructor
@Service
public class VehiculeService implements IVehiculeService {

    private final IVehiculeRepository vehiculeRepository;


    @Override
    public Vehicule createVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule updateVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public void deleteVehicule(Long id) {
        vehiculeRepository.deleteById(id);
    }

    @Override
    public Vehicule getVehiculeById(Long id) {
        return vehiculeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Vehicule> getAllVehicules() {
        return vehiculeRepository.findAll();
    }
}
