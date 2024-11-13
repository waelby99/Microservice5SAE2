package ms.reclamation.microservice.repositories;

import ms.reclamation.microservice.entities.Equipement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipementRepository extends JpaRepository<Equipement,Long> {

}
