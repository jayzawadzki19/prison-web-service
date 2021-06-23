package pl.ipp31.prisonwebservicebackend.service;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.ipp31.prisonwebservicebackend.dto.RegisterRequest;
import pl.ipp31.prisonwebservicebackend.entity.PrisonOfficer;
import pl.ipp31.prisonwebservicebackend.repository.PrisonOfficerRepository;

@Service
@AllArgsConstructor
public class RegisterService {

    private final PrisonOfficerRepository prisonOfficerRepository;
    private final PasswordEncoder passwordEncoder;

    public ResponseEntity<String> signUp(RegisterRequest registerRequest) {
        if (userExist(registerRequest)) {
            return new ResponseEntity<>("User already exists", HttpStatus.CONFLICT);
        }
        PrisonOfficer prisonOfficer = new PrisonOfficer();
        prisonOfficer.setName(registerRequest.getName());
        prisonOfficer.setSurname(registerRequest.getSurname());
        prisonOfficer.setUsername(registerRequest.getUsername());
        prisonOfficer.setPassword(passwordEncoder.encode(registerRequest.getPassword()));
        prisonOfficer.setActive(true);
        prisonOfficerRepository.save(prisonOfficer);
        return new ResponseEntity<>("Registration Successful", HttpStatus.OK);
    }

    private boolean userExist(RegisterRequest registerRequest) {
        return prisonOfficerRepository.existsByUsername(registerRequest.getUsername());
    }
}
