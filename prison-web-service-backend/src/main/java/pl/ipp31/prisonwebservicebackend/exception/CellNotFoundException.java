package pl.ipp31.prisonwebservicebackend.exception;

public class CellNotFoundException extends RuntimeException{
    public CellNotFoundException(String message) {
        super(message);
    }
}
