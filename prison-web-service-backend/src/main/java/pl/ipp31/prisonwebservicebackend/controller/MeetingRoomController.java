package pl.ipp31.prisonwebservicebackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.ipp31.prisonwebservicebackend.dto.MeetingRoomDTO;
import pl.ipp31.prisonwebservicebackend.exception.MeetingRoomNotFountException;
import pl.ipp31.prisonwebservicebackend.service.MeetingRoomService;

import java.util.List;

@RestController
@RequestMapping("/meetingrooms")
public class MeetingRoomController {
    private MeetingRoomService meetingRoomService;

    @Autowired
    public MeetingRoomController(MeetingRoomService meetingRoomService) {
        this.meetingRoomService = meetingRoomService;
    }

    @GetMapping("/byId/{id}")
    public ResponseEntity<MeetingRoomDTO> getMeetingRoomById(@PathVariable Long id) {
        return ResponseEntity.ok(meetingRoomService.getMeetingRoomById(id));
    }

    @GetMapping("/bySpots/{spot}")
    public ResponseEntity<List<MeetingRoomDTO>> getAllMeetingRoomsBySpots(@PathVariable int spots) {
        return ResponseEntity.ok(meetingRoomService.getAllMeetingRoomsBySpots(spots));
    }

    @ExceptionHandler(MeetingRoomNotFountException.class)
    public ResponseEntity<String> handleMeetingRoomNotFountException(MeetingRoomNotFountException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}
