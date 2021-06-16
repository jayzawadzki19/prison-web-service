package pl.ipp31.prisonwebservicebackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.ipp31.prisonwebservicebackend.dto.PrisonerDTO;
import pl.ipp31.prisonwebservicebackend.entity.Prisoner;
import pl.ipp31.prisonwebservicebackend.exception.PrisonOfficerNotFoundException;
import pl.ipp31.prisonwebservicebackend.repository.PrisonerRepository;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class PrisonerService {

    private PrisonerRepository prisonerRepository;

    @Autowired
    public PrisonerService(PrisonerRepository prisonerRepository) {
        this.prisonerRepository = prisonerRepository;
    }

    public PrisonerDTO getPrisonById(Long id) {
        PrisonerDTO prisonerDTO =
                mapPrisonerToDTO(
                        prisonerRepository.findById(id).orElseThrow(() -> new PrisonOfficerNotFoundException("PrisonOfficer was not found!")));
        return prisonerDTO;
    }

    public List<PrisonerDTO> getAllPrisoners() {
        return prisonerRepository
                .findAll()
                .stream().map(this::mapPrisonerToDTO).collect(Collectors.toList());
    }

    public void createPrisoner(Prisoner prisoner) {
        prisonerRepository.save(prisoner);
    }

    public void deletePrisoner(Long id) {
        prisonerRepository.deleteById(id);
    }


    public PrisonerDTO mapPrisonerToDTO(Prisoner prisoner) {
        return PrisonerDTO
                .builder()
                .id(prisoner.getId())
                .name(prisoner.getName())
                .surname(prisoner.getSurname())
                .judgement(prisoner.getJudgement())
                .cellId(prisoner.getCellId())
                .meetings(Set.copyOf(prisoner.getMeetings()))
                .build();
    }
}
