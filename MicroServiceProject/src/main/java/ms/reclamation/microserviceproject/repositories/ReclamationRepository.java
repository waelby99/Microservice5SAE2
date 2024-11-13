package ms.reclamation.microserviceproject.repositories;


import ms.reclamation.microserviceproject.entities.Reclamation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReclamationRepository extends JpaRepository<Reclamation,Long> {

}
