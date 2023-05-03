package at.ac.fhcampuswien.interface_segregation;

public class PushNotificationClient implements NotificationService{
    @Override
    public void sendEmail(String address, String subject, String message) {
        throw new UnsupportedOperationException("PushNotificationService does not support sending emails");
    }

    @Override
    public void sendSMS(String phoneNumber, String message) {
        throw new UnsupportedOperationException("PushNotificationService does not support sending SMS messages");
    }

    @Override
    public void sendPushNotification(String deviceId, String message) {
        // send push notification
        System.out.println("Push notification sent to " + deviceId + " with message " + message);
    }
}
