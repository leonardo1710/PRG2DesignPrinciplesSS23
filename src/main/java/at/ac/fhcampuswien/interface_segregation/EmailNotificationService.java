package at.ac.fhcampuswien.interface_segregation;

public interface EmailNotificationService {
    void sendEmail(String address, String subject, String message);
}
