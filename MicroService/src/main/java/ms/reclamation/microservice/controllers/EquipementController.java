package ms.reclamation.microservice.controllers;

import lombok.AllArgsConstructor;
import ms.reclamation.microservice.entities.Equipement;
import ms.reclamation.microservice.services.IEquipementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/Equipement")
@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials="true")
public class EquipementController {
    private IEquipementService iEquipementService;

    @PostMapping("/addEquipement")
    public Equipement addEquipement(
            @RequestBody Equipement r){
        return iEquipementService.addEquipement(r);
    }

    @GetMapping("/getAllr")
    public List<Equipement> getAllEquipement(){
        return iEquipementService.getAllEquipements();
    }

    @PutMapping("/modifierEquipement")
    public Equipement updateEquipement(@RequestBody Equipement r) {
        return iEquipementService.updateEquipement(r);
    }

    @GetMapping("/getEquipement/{idEquipement}")
    public Equipement findById(@PathVariable long idEquipement) {
        return iEquipementService.getEquipementById(idEquipement);
    }

    @DeleteMapping("/supprimerEquipement/{idEquipement}")
    public void deleteEquipement(@PathVariable long idEquipement) {
        iEquipementService.deleteEquipement(idEquipement);
    }




}
