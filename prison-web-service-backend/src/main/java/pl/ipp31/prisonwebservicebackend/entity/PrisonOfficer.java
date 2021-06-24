package pl.ipp31.prisonwebservicebackend.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "prison_officers")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PrisonOfficer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Username is required")
    private String username;

    @NotBlank(message = "Password is required")
    @Size(min = 5, message = "Password must contain at least 5 characters")
    private String password;

    @NotEmpty
    private String name;

    @NotEmpty
    private String surname;

    @NotNull
    private boolean isActive;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "prisoner_officer_id")
    private Set<Meeting> meetings;

    @NotEmpty
    private String role;

    {
        this.role = "ROLE_USER";
        this.meetings = new HashSet<>();
    }
}
