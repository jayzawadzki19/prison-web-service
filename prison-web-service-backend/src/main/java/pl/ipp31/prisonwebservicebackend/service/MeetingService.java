package pl.ipp31.prisonwebservicebackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.ipp31.prisonwebservicebackend.dto.MeetingDTO;
import pl.ipp31.prisonwebservicebackend.entity.Meeting;
import pl.ipp31.prisonwebservicebackend.exception.MeetingNotFountException;
import pl.ipp31.prisonwebservicebackend.repository.MeetingRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MeetingService {

    private MeetingRepository meetingRepository;

    @Autowired
    public MeetingService(MeetingRepository meetingRepository) {
        this.meetingRepository = meetingRepository;
    }

    public List<MeetingDTO> getAllMeetings() {

        List<Meeting> meetings = meetingRepository.findAll();
        List<MeetingDTO> dtos = new ArrayList<>();

        meetings.forEach(m -> dtos.add(mapMeetingToDTO(m)));

        return dtos;
    }

    public MeetingDTO getMeetingById(Long meetingId) {
        Optional<Meeting> optionalMeeting = meetingRepository.findById(meetingId);
        Meeting meeting = optionalMeeting.orElseThrow(() -> new MeetingNotFountException("Meeting does not exist!"));
        return mapMeetingToDTO(meeting);
    }

    public MeetingDTO mapMeetingToDTO(Meeting meeting) {
        MeetingDTO dto = new MeetingDTO();

        dto.setId(meeting.getId());
        dto.setMeetingEnd(meeting.getMeetingEnd());
        dto.setMeetingStart(meeting.getMeetingStart());
        dto.setFinished(meeting.isFinished());
        dto.setMeetingRoomId(meeting.getMeetingRoomId());
        dto.setPrisonerId(meeting.getPrisonerId());
        dto.setVisitorData(meeting.getVisitorData());
        dto.setPrisonOfficerId(meeting.getPrisonOfficerId());
        return dto;
    }
}
