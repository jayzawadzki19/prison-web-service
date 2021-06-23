package pl.ipp31.prisonwebservicebackend.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;
}
