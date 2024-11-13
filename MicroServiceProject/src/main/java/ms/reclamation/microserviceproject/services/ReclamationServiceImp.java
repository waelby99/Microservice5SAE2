package ms.reclamation.microserviceproject.services;

import lombok.AllArgsConstructor;
import ms.reclamation.microserviceproject.entities.Reclamation;
import ms.reclamation.microserviceproject.repositories.ReclamationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReclamationServiceImp implements IReclamationService {


    private ReclamationRepository reclamationReposiory;

    public Reclamation addReclamation(Reclamation r) {
        return reclamationReposiory.save(r);
    }

    @Override
    public List<Reclamation> getAllReclamations() {
        return reclamationReposiory.findAll();
    }

    @Override
    public void deleteReclamation(long idReclamation) {
        reclamationReposiory.deleteById(idReclamation);
    }

    @Override
    public Reclamation updateReclamation(Reclamation r) {
        return reclamationReposiory.save(r);
    }

    @Override
    public Reclamation getReclamationById(long idReclamation) {
        return reclamationReposiory.findById(idReclamation).orElse(null);
    }
}