package ms.piste.microserviceproject.repositories;

import ms.piste.microserviceproject.entities.Piste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPisteRepository extends JpaRepository<Piste, Long> {

}
