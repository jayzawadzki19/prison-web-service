package pl.ipp31.prisonwebservicebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ipp31.prisonwebservicebackend.entity.Cell;

public interface CellRepository extends JpaRepository<Cell, Long> {
}
