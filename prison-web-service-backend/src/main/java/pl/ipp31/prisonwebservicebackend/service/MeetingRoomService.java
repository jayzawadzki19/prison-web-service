package pl.ipp31.prisonwebservicebackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.ipp31.prisonwebservicebackend.dto.MeetingRoomDTO;
import pl.ipp31.prisonwebservicebackend.entity.MeetingRoom;
import pl.ipp31.prisonwebservicebackend.exception.MeetingRoomNotFountException;
import pl.ipp31.prisonwebservicebackend.repository.MeetingRoomsRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MeetingRoomService {
    private MeetingRoomsRepository meetingRoomsRepository;

    @Autowired
    public MeetingRoomService(MeetingRoomsRepository meetingRoomsRepository) {
        this.meetingRoomsRepository = meetingRoomsRepository;
    }

    public List<MeetingRoomDTO> getAllMeetingRooms() {
        List<MeetingRoom> meetingRooms = meetingRoomsRepository.findAll();
        List<MeetingRoomDTO> dtos = new ArrayList<>();

        meetingRooms.forEach(meetingRoom -> dtos.add(mapMeetingRoomToDTO(meetingRoom)));

        return dtos;
    }

    public MeetingRoomDTO mapMeetingRoomToDTO(MeetingRoom meetingRoom) {
        MeetingRoomDTO dto = new MeetingRoomDTO();

        dto.setId(meetingRoom.getId());
        dto.setMeetings(meetingRoom.getMeetings());
        dto.setSpots(meetingRoom.getSpots());
        dto.setRoomNumber(meetingRoom.getRoomNumber());

        return dto;
    }

    public MeetingRoomDTO getMeetingRoomById(Long meetingRoomId) {
        Optional<MeetingRoom> optionalMeetingRoom = meetingRoomsRepository.findById(meetingRoomId);
        MeetingRoom meetingRoom = optionalMeetingRoom.orElseThrow(() -> new MeetingRoomNotFountException("Meeting room does not exist!"));
        return mapMeetingRoomToDTO(meetingRoom);
    }

    public List<MeetingRoomDTO> getAllMeetingRoomsBySpots(int spots) {
        List<MeetingRoom> meetingRooms = meetingRoomsRepository.findAllBySpots(spots);
        List<MeetingRoomDTO> dtos = new ArrayList<>();

        meetingRooms.forEach(meetingRoom -> dtos.add(mapMeetingRoomToDTO(meetingRoom)));

        return dtos;
    }
}
