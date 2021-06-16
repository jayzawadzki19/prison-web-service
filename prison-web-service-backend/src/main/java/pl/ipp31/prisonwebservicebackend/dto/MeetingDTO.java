package pl.ipp31.prisonwebservicebackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MeetingDTO {

    private Long id;
    private String visitorData;
    private LocalDateTime meetingStart;
    private LocalDateTime meetingEnd;
    private Long prisonerId;
    private Long prisonOfficerId;
    private Long meetingRoomId;
    private boolean isFinished;

}
