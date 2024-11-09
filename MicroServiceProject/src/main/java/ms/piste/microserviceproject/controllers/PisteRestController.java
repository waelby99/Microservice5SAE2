package ms.piste.microserviceproject.controllers;

import lombok.AllArgsConstructor;
import ms.piste.microserviceproject.entities.Piste;
import ms.piste.microserviceproject.services.IPisteServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/piste")
@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600, allowCredentials="true")
public class PisteRestController {

    private IPisteServices pisteServices;

    @PostMapping("/add")
    public Piste addPiste(@RequestBody Piste piste){
        return  pisteServices.addPiste(piste);
    }

    @GetMapping("/all")
    public List<Piste> getAllPistes(){
        return pisteServices.retrieveAllPistes();
    }

    @PutMapping("/update")
    public Piste updatePiste(@RequestBody Piste piste){
        return  pisteServices.updatePiste(piste);
    }

    @GetMapping("/get/{id-piste}")
    public Piste getById(@PathVariable("id-piste") Long numPiste){
        return pisteServices.retrievePiste(numPiste);
    }

    @DeleteMapping("/delete/{id-piste}")
    public void deleteById(@PathVariable("id-piste") Long numPiste){
        pisteServices.removePiste(numPiste);
    }

}

