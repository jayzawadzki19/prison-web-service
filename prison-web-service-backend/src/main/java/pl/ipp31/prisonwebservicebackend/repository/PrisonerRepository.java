package pl.ipp31.prisonwebservicebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ipp31.prisonwebservicebackend.entity.Prisoner;

public interface PrisonerRepository extends JpaRepository<Prisoner, Long> {
}
