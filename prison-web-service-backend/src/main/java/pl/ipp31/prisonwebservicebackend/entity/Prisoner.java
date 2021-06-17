package pl.ipp31.prisonwebservicebackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "prisoners")
@NoArgsConstructor
@AllArgsConstructor
public class Prisoner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String surname;

    @NotBlank
    private String judgement;

    @NotEmpty
    @Column(name = "cell_id")
    private Long cellId;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "prisoner_id")
    private Set<Meeting> meetings;

    {
        this.meetings = new HashSet<>();
    }
}
