package ms.reclamation.microservice.services;

import lombok.AllArgsConstructor;
import ms.reclamation.microservice.entities.Equipement;
import ms.reclamation.microservice.repositories.EquipementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipementServiceImp implements IEquipementService {


    private EquipementRepository equipementReposiory;

    public Equipement addEquipement(Equipement r) {
        return equipementReposiory.save(r);
    }

    @Override
    public List<Equipement> getAllEquipements() {
        return equipementReposiory.findAll();
    }

    @Override
    public void deleteEquipement(long idEquipement) {
        equipementReposiory.deleteById(idEquipement);
    }

    @Override
    public Equipement updateEquipement(Equipement r) {
        return equipementReposiory.save(r);
    }

    @Override
    public Equipement getEquipementById(long idReclamation) {
        return equipementReposiory.findById(idReclamation).orElse(null);
    }


}