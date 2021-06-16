package pl.ipp31.prisonwebservicebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.ipp31.prisonwebservicebackend.entity.PrisonOfficer;

@Repository
public interface PrisonOfficerRepository extends JpaRepository<PrisonOfficer, Long> {
}
