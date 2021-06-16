package pl.ipp31.prisonwebservicebackend.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import pl.ipp31.prisonwebservicebackend.entity.Cell;

import java.util.List;

@Repository
public interface CellRepository extends JpaRepository<Cell, Long> {
    List<Cell>findAllByCellNumber(int cellNumber);
    List<Cell>findAllBySpots(int spots);
}
