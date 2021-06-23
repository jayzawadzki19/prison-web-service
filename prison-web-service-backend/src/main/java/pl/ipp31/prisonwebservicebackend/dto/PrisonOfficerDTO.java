package pl.ipp31.prisonwebservicebackend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.ipp31.prisonwebservicebackend.entity.Meeting;

import java.util.Set;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class PrisonOfficerDTO {

    private Long id;
    private String name;
    private String surname;
    private Set<Meeting> meetings;
}
