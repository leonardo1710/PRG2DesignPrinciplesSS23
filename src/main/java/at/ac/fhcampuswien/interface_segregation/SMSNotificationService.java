package at.ac.fhcampuswien.interface_segregation;

public interface SMSNotificationService {
    void sendSMS(String phoneNumber, String message);
}
