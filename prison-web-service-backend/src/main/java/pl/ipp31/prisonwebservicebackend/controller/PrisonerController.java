package pl.ipp31.prisonwebservicebackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.ipp31.prisonwebservicebackend.dto.PrisonerDTO;
import pl.ipp31.prisonwebservicebackend.entity.Prisoner;
import pl.ipp31.prisonwebservicebackend.service.PrisonerService;

import java.util.List;

@RestController
@RequestMapping("/prisoners")
public class PrisonerController {

    private PrisonerService prisonerService;

    @Autowired
    public PrisonerController(PrisonerService prisonerService) {
        this.prisonerService = prisonerService;
    }

    @GetMapping("/byId/{id}")
    public ResponseEntity<PrisonerDTO> getPrisonerById(@PathVariable Long id) {
        return ResponseEntity.ok(prisonerService.getPrisonById(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<PrisonerDTO>> getAllPrisoners() {
        return ResponseEntity.ok(prisonerService.getAllPrisoners());
    }

    @PostMapping("/new")
    public ResponseEntity<Prisoner> createPrisoner(@RequestBody Prisoner prisoner) {
        prisonerService.createPrisoner(prisoner);
        return ResponseEntity.status(HttpStatus.CREATED).body(prisoner);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteMeeting(@PathVariable Long id) {
        prisonerService.deletePrisoner(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
