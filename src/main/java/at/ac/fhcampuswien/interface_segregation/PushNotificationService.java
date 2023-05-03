package at.ac.fhcampuswien.interface_segregation;

public interface PushNotificationService {
    void sendPushNotification(String deviceId, String message);
}
