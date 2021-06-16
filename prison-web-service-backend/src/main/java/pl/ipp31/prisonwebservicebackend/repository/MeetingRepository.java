package pl.ipp31.prisonwebservicebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.ipp31.prisonwebservicebackend.entity.Meeting;

import java.util.List;

@Repository
public interface MeetingRepository extends JpaRepository<Meeting, Long> {
    List<Meeting> findAllByPrisonerId(Long id);
    List<Meeting> findAllByFinished(boolean b);
    List<Meeting> findAllByPrisonOfficerId(Long id);
    List<Meeting> findAllByMeetingRoomId(Long id);
}
