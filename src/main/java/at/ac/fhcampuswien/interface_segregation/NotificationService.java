package at.ac.fhcampuswien.interface_segregation;

public interface NotificationService {
    void sendEmail(String address, String subject, String message);
    void sendSMS(String phoneNumber, String message);
    void sendPushNotification(String deviceId, String message);
}
