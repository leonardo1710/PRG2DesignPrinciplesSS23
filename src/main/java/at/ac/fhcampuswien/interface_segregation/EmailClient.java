package at.ac.fhcampuswien.interface_segregation;

public class EmailClient implements NotificationService {
    @Override
    public void sendEmail(String address, String subject, String message) {
        // send email
        System.out.println("Email sent to " + address + " with subject " + subject + " and message " + message);
    }

    @Override
    public void sendSMS(String phoneNumber, String message) {
        throw new UnsupportedOperationException("EmailNotificationService does not support sending SMS messages");
    }

    @Override
    public void sendPushNotification(String deviceId, String message) {
        throw new UnsupportedOperationException("EmailNotificationService does not support sending push notifications");
    }
}
