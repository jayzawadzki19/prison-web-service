package pl.ipp31.prisonwebservicebackend.dto;

import lombok.Data;

@Data
public class RegisterRequest {

    private String username;
    private String password;
    private String name;
    private String surname;
}
