package ms.piste.microserviceproject.services;

import lombok.AllArgsConstructor;
import ms.piste.microserviceproject.entities.Piste;
import ms.piste.microserviceproject.repositories.IPisteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class PisteServicesImpl implements  IPisteServices{

    private IPisteRepository pisteRepository;

    @Override
    public List<Piste> retrieveAllPistes() {
        return pisteRepository.findAll();
    }

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }


    @Override
    public void removePiste(Long numPiste) {
        pisteRepository.deleteById(numPiste);
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        return pisteRepository.findById(numPiste).orElse(null);
    }
}

