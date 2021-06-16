package pl.ipp31.prisonwebservicebackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.ipp31.prisonwebservicebackend.dto.MeetingDTO;
import pl.ipp31.prisonwebservicebackend.exception.MeetingNotFountException;
import pl.ipp31.prisonwebservicebackend.service.MeetingService;

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




    @ExceptionHandler(MeetingNotFountException.class)
    public ResponseEntity<String> handleMeetingNotFountException(MeetingNotFountException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}
