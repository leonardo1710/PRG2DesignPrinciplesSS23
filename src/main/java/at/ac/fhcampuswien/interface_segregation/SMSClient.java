package at.ac.fhcampuswien.interface_segregation;

public class SMSClient implements NotificationService {
    @Override
    public void sendEmail(String address, String subject, String message) {
        throw new UnsupportedOperationException("SMSNotificationService does not support sending emails");
    }

    @Override
    public void sendSMS(String phoneNumber, String message) {
        // send SMS
        System.out.println("SMS sent to " + phoneNumber + " with message " + message);
    }

    @Override
    public void sendPushNotification(String deviceId, String message) {
        throw new UnsupportedOperationException("SMSNotificationService does not support sending push notifications");
    }
}
