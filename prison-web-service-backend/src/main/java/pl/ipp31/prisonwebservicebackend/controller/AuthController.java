package pl.ipp31.prisonwebservicebackend.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.ipp31.prisonwebservicebackend.dto.LoginRequest;
import pl.ipp31.prisonwebservicebackend.dto.LoginResponse;
import pl.ipp31.prisonwebservicebackend.dto.RegisterRequest;
import pl.ipp31.prisonwebservicebackend.service.LoginService;
import pl.ipp31.prisonwebservicebackend.service.RegisterService;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthController {
    private final RegisterService registerService;
    private final LoginService loginService;

    @PostMapping("/register")
    public ResponseEntity<String> registerNewUser(@RequestBody RegisterRequest registerRequest){
        return registerService.signUp(registerRequest);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest){
        return ResponseEntity.ok(loginService.login(loginRequest));
    }
}
