package pl.ipp31.prisonwebservicebackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.ipp31.prisonwebservicebackend.entity.Meeting;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MeetingRoomDTO {

    private Long id;
    private int roomNumber;
    private int spots;
    private Set<Meeting> meetings;

    {
        this.meetings = new HashSet<>();
    }
}
