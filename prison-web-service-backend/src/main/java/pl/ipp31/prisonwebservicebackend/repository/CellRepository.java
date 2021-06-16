package pl.ipp31.prisonwebservicebackend.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import pl.ipp31.prisonwebservicebackend.entity.Cell;

import java.util.List;

public interface CellRepository extends JpaRepository<Cell, Long> {
    List<Cell>findAllByCellNumber(int cellNumber);
    List<Cell>findAllBySpots(int spots);
}
