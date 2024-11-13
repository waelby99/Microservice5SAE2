package ms.reclamation.microservice.services;

import ms.reclamation.microservice.entities.Equipement;

import java.util.List;

public interface IEquipementService {
    Equipement addEquipement(Equipement r);

    public List<Equipement> getAllEquipements();

    public Equipement getEquipementById(long idEquipement);

    public void deleteEquipement(long idEquipement);

    public Equipement updateEquipement(Equipement r);


}
