package at.ac.fhcampuswien.interface_segregation;

public class PushNotificationClient implements PushNotificationService {
    @Override
    public void sendPushNotification(String deviceId, String message) {
        // send push notification
        System.out.println("Push notification sent to " + deviceId + " with message " + message);
    }
}
