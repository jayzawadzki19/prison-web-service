package pl.ipp31.prisonwebservicebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ipp31.prisonwebservicebackend.entity.Meeting;

public interface MeetingRepository extends JpaRepository<Meeting, Long> {
}
