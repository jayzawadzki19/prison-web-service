package pl.ipp31.prisonwebservicebackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.ipp31.prisonwebservicebackend.dto.CellDTO;
import pl.ipp31.prisonwebservicebackend.dto.MeetingDTO;
import pl.ipp31.prisonwebservicebackend.exception.CellNotFoundException;
import pl.ipp31.prisonwebservicebackend.exception.MeetingNotFountException;
import pl.ipp31.prisonwebservicebackend.repository.CellRepository;
import pl.ipp31.prisonwebservicebackend.service.CellService;

import java.util.List;

@RestController
@RequestMapping("/cells")
public class CellController {
    private CellService cellService;
    @Autowired
    CellController(CellService cellService){this.cellService=cellService;}

    @GetMapping("/byId/{id}")
    public ResponseEntity<CellDTO> getCellById(@PathVariable Long id) {
        return ResponseEntity.ok(cellService.getCellById(id));
    }
    @GetMapping("/bySpots/{spots}")
    public ResponseEntity<List<CellDTO>> getCellBySpots(@PathVariable int spots) {
        return ResponseEntity.ok(cellService.getCellsBySpots(spots));}

    @GetMapping("/byCellNumber/{number}")
    public ResponseEntity<List<CellDTO>> getCellByCellNumber(@PathVariable int number) {
        return ResponseEntity.ok(cellService.getCellsByCellNumber(number));}

@GetMapping("/getAll")
public ResponseEntity<List<CellDTO>> getAllCells(){
        return ResponseEntity.ok(cellService.getAllCells());
}

    @ExceptionHandler(CellNotFoundException.class)
    public ResponseEntity<String> handleMeetingNotFountException(CellNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}
