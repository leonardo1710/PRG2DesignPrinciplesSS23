package at.ac.fhcampuswien.interface_segregation;

<<<<<<<< HEAD:src/main/java/at/ac/fhcampuswien/interface_segregation/PushNotificationClient.java
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
<<<<<<< HEAD
=======
========
public interface PushNotificationService {
    void sendPushNotification(String deviceId, String message);
>>>>>>>> master:src/main/java/at/ac/fhcampuswien/interface_segregation/PushNotificationService.java
>>>>>>> master
}
