package pl.ipp31.prisonwebservicebackend.exception;

public class MeetingNotFountException extends RuntimeException{
    public MeetingNotFountException(String message) {
        super(message);
    }
}
