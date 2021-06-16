package pl.ipp31.prisonwebservicebackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CellDTO {
    private Long id;
    private int cellNumber;
    private int spots;
}
