package pl.ipp31.prisonwebservicebackend.repo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pl.ipp31.prisonwebservicebackend.entity.PrisonOfficer;
import pl.ipp31.prisonwebservicebackend.repository.PrisonOfficerRepository;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class PrisonOfficerRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    private PrisonOfficerRepository prisonOfficerRepository;

    @Test
    public void shouldFindByUsername() {
        // Given
        PrisonOfficer officer = new PrisonOfficer();
        officer.setUsername("TESTNAME");
        entityManager.persist(officer);
        entityManager.flush();

        // When
        PrisonOfficer found = prisonOfficerRepository.getByUsername(officer.getUsername()).get();

        // Then
        assertThat(found.getUsername()).isEqualTo(officer.getUsername());
    }
}
