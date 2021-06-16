package pl.ipp31.prisonwebservicebackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.ipp31.prisonwebservicebackend.dto.MeetingDTO;
import pl.ipp31.prisonwebservicebackend.exception.MeetingNotFountException;
import pl.ipp31.prisonwebservicebackend.service.MeetingService;

import java.util.List;

@RestController
@RequestMapping("/meetings")
public class MeetingController {

    private MeetingService meetingService;

    @Autowired
    public MeetingController(MeetingService meetingService) {
        this.meetingService = meetingService;
    }

    @GetMapping("/byId/{id}")
    public ResponseEntity<MeetingDTO> getMeetingById(@PathVariable Long id) {
        return ResponseEntity.ok(meetingService.getMeetingById(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<MeetingDTO>> getAllMeetings() {
        return ResponseEntity.ok(meetingService.getAllMeetings());
    }

    @GetMapping("/byPrisoner/{id}")
    public ResponseEntity<List<MeetingDTO>> getAllByPrisonerId(@PathVariable Long id) {
        return ResponseEntity.ok(meetingService.getAllByPrisonerId(id));
    }

    @GetMapping("/byPrisonerOfficer/{id}")
    public ResponseEntity<List<MeetingDTO>> getAllByPrisonOfficerId(@PathVariable Long id) {
        return ResponseEntity.ok(meetingService.getAllByPrisonOfficerId(id));
    }

    @GetMapping("/roomId/{id}")
    public ResponseEntity<List<MeetingDTO>> getAllByMeetingRoomId(@PathVariable Long id) {
        return ResponseEntity.ok(meetingService.getAllByMeetingRoomId(id));
    }

    @GetMapping("/byFinished")
    public ResponseEntity<List<MeetingDTO>> getAllByFinished(@RequestParam String finished) {
        return ResponseEntity.ok(meetingService.getAllByFinished(finished));
    }

    @PostMapping("/new")
    public ResponseEntity<MeetingDTO> createMeeting(@RequestBody MeetingDTO meetingDTO) {
        meetingService.createMeeting(meetingDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(meetingDTO);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteMeeting(@PathVariable Long id) {
        meetingService.deleteMeeting(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }


    @ExceptionHandler(MeetingNotFountException.class)
    public ResponseEntity<String> handleMeetingNotFountException(MeetingNotFountException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}
