package pl.ipp31.prisonwebservicebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ipp31.prisonwebservicebackend.entity.PrisonOfficer;

public interface PrisonOfficerRepository extends JpaRepository<PrisonOfficer, Long> {
}
