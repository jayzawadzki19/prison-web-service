package pl.ipp31.prisonwebservicebackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.ipp31.prisonwebservicebackend.dto.CellDTO;
import pl.ipp31.prisonwebservicebackend.entity.Cell;
import pl.ipp31.prisonwebservicebackend.exception.CellNotFoundException;
import pl.ipp31.prisonwebservicebackend.repository.CellRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CellService {
    private CellRepository cellRepository;

    @Autowired
    public CellService(CellRepository cellRepository) {
        this.cellRepository = cellRepository;
    }

    public CellDTO getCellById(Long cellId) {
        Optional<Cell> optionalCell = cellRepository.findById(cellId);
        Cell cell = optionalCell.orElseThrow(() -> new CellNotFoundException("Cell does not exist!"));
        return mapCellTOdto(cell);
    }

    public List<CellDTO> getAllCells() {
        List<Cell> cells = cellRepository.findAll();
        List<CellDTO> dtos = new ArrayList<>();

        cells.forEach(m -> dtos.add(mapCellTOdto(m)));

        return dtos;
    }

    public List<CellDTO> getCellsBySpots(int spots) {
        List<Cell> cells = cellRepository.findAllBySpots(spots);
        List<CellDTO> dtos = new ArrayList<>();
        cells.forEach(m -> dtos.add(mapCellTOdto(m)));
        return dtos;

    }

    public List<CellDTO> getCellsByCellNumber(int cellNumber) {
        List<Cell> cells = cellRepository.findAllByCellNumber(cellNumber);
        List<CellDTO> dtos = new ArrayList<>();
        cells.forEach(m -> dtos.add(mapCellTOdto(m)));
        return dtos;

    }

    public CellDTO mapCellTOdto(Cell cell) {
        CellDTO dto = new CellDTO();
        dto.setId(cell.getId());
        dto.setCellNumber(cell.getCellNumber());
        dto.setSpots(cell.getSpots());
        return dto;
    }

    public void createCell(Cell cell) {
        cellRepository.save(cell);
    }

    public void deleteCell(Long id) {
        cellRepository.deleteById(id);
    }
}
