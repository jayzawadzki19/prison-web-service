package pl.ipp31.prisonwebservicebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ipp31.prisonwebservicebackend.entity.MeetingRoom;
import java.util.List;

public interface MeetingRoomsRepository extends JpaRepository<MeetingRoom, Long> {
    List<MeetingRoom> findAllByRoomNumber(int roomNumber);
    List<MeetingRoom> findAllBySpots(int spots);
}
