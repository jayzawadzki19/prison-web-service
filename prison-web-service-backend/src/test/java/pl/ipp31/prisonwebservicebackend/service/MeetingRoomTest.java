package pl.ipp31.prisonwebservicebackend.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.ipp31.prisonwebservicebackend.dto.MeetingDTO;
import pl.ipp31.prisonwebservicebackend.entity.Meeting;
import pl.ipp31.prisonwebservicebackend.repository.MeetingRepository;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MeetingRoomTest {

    @Mock
    MeetingRepository meetingRepository;

    @Mock
    MeetingService meetingService;

    @Test
    @DisplayName("This method should return meeting by id")
    void shouldGetMeetingById() {

        MeetingDTO meetingDTO =
                new MeetingDTO(123L,
                        "test",
                        LocalDateTime.now(),
                        LocalDateTime.now(),
                        1L,1L,1L,true);
        Meeting meeting =
                new Meeting(123L,
                        "test",
                        LocalDateTime.now(),
                        LocalDateTime.now(),
                        1L,1L,1L,true);



        lenient().when(meetingRepository.findById(123L)).thenReturn(Optional.of(meeting));
        when(meetingService.getMeetingById(123L)).thenReturn(meetingDTO);

        MeetingDTO response = meetingService.getMeetingById(123L);
        assertThat(response.getId()).isEqualTo(meeting.getId());



    }
}