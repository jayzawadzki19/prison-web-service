package pl.ipp31.prisonwebservicebackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.ipp31.prisonwebservicebackend.dto.PrisonOfficerDTO;
import pl.ipp31.prisonwebservicebackend.entity.PrisonOfficer;
import pl.ipp31.prisonwebservicebackend.exception.PrisonOfficerNotFoundException;
import pl.ipp31.prisonwebservicebackend.repository.PrisonOfficerRepository;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class PrisonOfficerService {

    private PrisonOfficerRepository prisonOfficerRepository;

    @Autowired
    public PrisonOfficerService(PrisonOfficerRepository prisonOfficerRepository) {
        this.prisonOfficerRepository = prisonOfficerRepository;
    }

    public PrisonOfficerDTO getPrisonOfficerById(Long id) {
        PrisonOfficerDTO prisonOfficerDTO =
                mapPrisonOfficerToDTO(
                        prisonOfficerRepository.findById(id).orElseThrow(() -> new PrisonOfficerNotFoundException("PrisonOfficer was not found!")));
        return prisonOfficerDTO;
    }

    public List<PrisonOfficerDTO> getAllPrisonOfficers() {
        return prisonOfficerRepository
                .findAll()
                .stream().map(this::mapPrisonOfficerToDTO).collect(Collectors.toList());
    }

    public void createOfficer(PrisonOfficer officer) {
        prisonOfficerRepository.save(officer);
    }

    public void deleteOfficer(Long id) {
        prisonOfficerRepository.deleteById(id);
    }


    public PrisonOfficerDTO mapPrisonOfficerToDTO(PrisonOfficer prisonOfficer) {
        return PrisonOfficerDTO
                .builder()
                .id(prisonOfficer.getId())
                .name(prisonOfficer.getName())
                .surname(prisonOfficer.getSurname())
                .meetings(Set.copyOf(prisonOfficer.getMeetings()))
                .build();
    }
}
