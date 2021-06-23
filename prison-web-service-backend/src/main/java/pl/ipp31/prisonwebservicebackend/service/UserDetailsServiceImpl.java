package pl.ipp31.prisonwebservicebackend.service;

import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.ipp31.prisonwebservicebackend.entity.PrisonOfficer;
import pl.ipp31.prisonwebservicebackend.repository.PrisonOfficerRepository;

import java.util.Collection;
import java.util.Optional;

import static java.util.Collections.singletonList;

@AllArgsConstructor
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final PrisonOfficerRepository prisonOfficerRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<PrisonOfficer> prisonOptional = prisonOfficerRepository.getByUsername(username);
        PrisonOfficer prisonOfficer = prisonOptional.orElseThrow(() -> new UsernameNotFoundException("User " + username + " not found"));
        return new org.springframework.security.core.userdetails.User(
                prisonOfficer.getUsername(), prisonOfficer.getPassword(),
                prisonOfficer.isActive(), true,
                true, true,
                getAuthorities("ROLE_USER"));
    }



    private Collection<? extends GrantedAuthority> getAuthorities(String role) {
        return singletonList(new SimpleGrantedAuthority(role));
    }


}
