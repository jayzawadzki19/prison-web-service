package pl.ipp31.prisonwebservicebackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.ipp31.prisonwebservicebackend.dto.PrisonOfficerDTO;
import pl.ipp31.prisonwebservicebackend.entity.PrisonOfficer;
import pl.ipp31.prisonwebservicebackend.exception.PrisonOfficerNotFoundException;
import pl.ipp31.prisonwebservicebackend.service.PrisonOfficerService;

import java.util.List;

@RestController
@RequestMapping("/PrisonOfficers")
public class PrisonOfficerController {

    private PrisonOfficerService prisonOfficerService;

    @Autowired
    public PrisonOfficerController(PrisonOfficerService prisonOfficerService) {
        this.prisonOfficerService = prisonOfficerService;
    }

    @GetMapping("/byId/{id}")
    public ResponseEntity<PrisonOfficerDTO> getById(@PathVariable Long id) {
        return ResponseEntity.ok(prisonOfficerService.getPrisonOfficerById(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<PrisonOfficerDTO>> getAll() {
        return ResponseEntity.ok(prisonOfficerService.getAllPrisonOfficers());
    }

    @PostMapping("/new")
    public ResponseEntity<String> createNew(@RequestBody PrisonOfficer prisonOfficer) {
        prisonOfficerService.createOfficer(prisonOfficer);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        prisonOfficerService.deleteOfficer(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @ExceptionHandler(PrisonOfficerNotFoundException.class)
    public ResponseEntity<String> handleMeetingNotFountException(PrisonOfficerNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

}
