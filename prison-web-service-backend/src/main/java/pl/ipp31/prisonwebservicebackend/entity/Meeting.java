package pl.ipp31.prisonwebservicebackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "meetings")
@NoArgsConstructor
@AllArgsConstructor
public class Meeting {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String visitorData;

    private LocalDateTime meetingStart;

    private LocalDateTime meetingEnd;

    @Column(name = "prisoner_id")
    private Long prisonerId;

    @Column(name = "prisoner_officer_id")
    private Long prisonOfficerId;

    @Column(name = "meeting_room_id")
    private Long meetingRoomId;

    @NotNull
    private boolean isFinished;

}
