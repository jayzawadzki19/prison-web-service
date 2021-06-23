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

    private final MeetingRepository meetingRepository;

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

    public List<MeetingDTO> getAllByPrisonerId(Long id) {

        List<Meeting> meetings = meetingRepository.findAllByPrisonerId(id);
        List<MeetingDTO> dtos = new ArrayList<>();

        meetings.forEach(m -> dtos.add(mapMeetingToDTO(m)));

        return dtos;
    }

    public List<MeetingDTO> getAllByPrisonOfficerId(Long id) {

        List<Meeting> meetings = meetingRepository.findAllByPrisonOfficerId(id);
        List<MeetingDTO> dtos = new ArrayList<>();

        meetings.forEach(m -> dtos.add(mapMeetingToDTO(m)));

        return dtos;
    }

    public List<MeetingDTO> getAllByMeetingRoomId(Long id) {

        List<Meeting> meetings = meetingRepository.findAllByMeetingRoomId(id);
        List<MeetingDTO> dtos = new ArrayList<>();

        meetings.forEach(m -> dtos.add(mapMeetingToDTO(m)));

        return dtos;
    }

    public List<MeetingDTO> getAllByFinished(String b) {
        boolean finished = b.equalsIgnoreCase("yes");
        List<Meeting> meetings = meetingRepository.findAllByIsFinished(finished);
        List<MeetingDTO> dtos = new ArrayList<>();

        meetings.forEach(m -> dtos.add(mapMeetingToDTO(m)));

        return dtos;
    }

    public MeetingDTO getMeetingById(Long meetingId) {
        Optional<Meeting> optionalMeeting = meetingRepository.findById(meetingId);
        Meeting meeting = optionalMeeting.orElseThrow(() -> new MeetingNotFountException("Meeting does not exist!"));
        return mapMeetingToDTO(meeting);
    }

    public void createMeeting(MeetingDTO meetingDTO) {
        meetingRepository.save(mapDTOtoMeeting(meetingDTO));
    }

    public void deleteMeeting(Long id) {
        Optional<Meeting> optionalMeeting = meetingRepository.findById(id);
        Meeting meeting = optionalMeeting.orElseThrow(() -> new MeetingNotFountException("Meeting does not exist!"));
        meetingRepository.delete(meeting);
    }

    public MeetingDTO mapMeetingToDTO(Meeting meeting) {
        return MeetingDTO
                .builder()
                .id(meeting.getId())
                .meetingEnd(meeting.getMeetingEnd())
                .meetingStart(meeting.getMeetingStart())
                .isFinished(meeting.isFinished())
                .meetingRoomId(meeting.getMeetingRoomId())
                .prisonerId(meeting.getPrisonerId())
                .visitorData(meeting.getVisitorData())
                .prisonOfficerId(meeting.getPrisonOfficerId()).build();
    }

    public Meeting mapDTOtoMeeting(MeetingDTO meeting) {
        return Meeting
                .builder()
                .id(meeting.getId())
                .meetingEnd(meeting.getMeetingEnd())
                .meetingStart(meeting.getMeetingStart())
                .isFinished(meeting.isFinished())
                .meetingRoomId(meeting.getMeetingRoomId())
                .prisonerId(meeting.getPrisonerId())
                .visitorData(meeting.getVisitorData())
                .prisonOfficerId(meeting.getPrisonOfficerId()).build();
    }
}
