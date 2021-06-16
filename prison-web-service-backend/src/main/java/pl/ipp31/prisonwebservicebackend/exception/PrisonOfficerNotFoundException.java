package pl.ipp31.prisonwebservicebackend.exception;

public class PrisonOfficerNotFoundException extends RuntimeException {
    public PrisonOfficerNotFoundException(String s) {
        super(s);
    }
}
