package pl.ipp31.prisonwebservicebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ipp31.prisonwebservicebackend.entity.MeetingRoom;

public interface MeetingRoomsRepository extends JpaRepository<MeetingRoom, Long> {
}
