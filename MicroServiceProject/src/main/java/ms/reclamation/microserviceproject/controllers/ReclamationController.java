package ms.reclamation.microserviceproject.controllers;

import lombok.AllArgsConstructor;

import ms.reclamation.microserviceproject.entities.Reclamation;
import ms.reclamation.microserviceproject.services.IReclamationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/Reclamation")
@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials="true")
public class ReclamationController {
    private IReclamationService iReclamationService;

    @PostMapping("/addReclamation")
    public Reclamation addReclamation(
            @RequestBody Reclamation r){
        return iReclamationService.addReclamation(r);
    }

    @GetMapping("/getAllr")
    public List<Reclamation> getAllReclamation(){
        return iReclamationService.getAllReclamations();
    }

    @PutMapping("/modifierReclamation")
    public Reclamation updateReclamation(@RequestBody Reclamation r) {
        return iReclamationService.updateReclamation(r);
    }

    @GetMapping("/getReclamation/{idReclamation}")
    public Reclamation findById(@PathVariable long idReclamation) {
        return iReclamationService.getReclamationById(idReclamation);
    }

    @DeleteMapping("/supprimerReclamation/{idReclamation}")
    public void deleteReclamation(@PathVariable long idReclamation) {
        iReclamationService.deleteReclamation(idReclamation);
    }




}
