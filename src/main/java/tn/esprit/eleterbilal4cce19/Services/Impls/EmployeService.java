package tn.esprit.eleterbilal4cce19.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.eleterbilal4cce19.Domain.Employe;
import tn.esprit.eleterbilal4cce19.Repositories.IEmployeRepository;
import tn.esprit.eleterbilal4cce19.Services.IEmployeService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeService implements IEmployeService {
    private final IEmployeRepository employeRepository;

    @Override
    public Employe createEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe updateEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public void deleteEmploye(Employe employe) {
        employeRepository.delete(employe);
    }

    @Override
    public Employe getEmployeById(Long id) {
        return employeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Employe> getAllEmployes() {
        return employeRepository.findAll();
    }
}
