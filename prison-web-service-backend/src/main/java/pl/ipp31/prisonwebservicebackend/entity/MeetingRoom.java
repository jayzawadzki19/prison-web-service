package pl.ipp31.prisonwebservicebackend.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "meeting_rooms")
@NoArgsConstructor
public class MeetingRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private int roomNumber;

    @NotNull
    private int spots;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "meeting_room_id")
    private Set<Meeting> meetings;

    {
        this.meetings = new HashSet<>();
    }
}
