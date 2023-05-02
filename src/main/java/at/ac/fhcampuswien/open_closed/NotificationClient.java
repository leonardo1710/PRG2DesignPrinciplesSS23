package at.ac.fhcampuswien.open_closed;

import java.util.ArrayList;
import java.util.List;

public class NotificationClient {
    public static void main(String[] args) {
        List<Notification> notifications = new ArrayList<>();
        Notification emailNotification = new Notification();
        Notification smsNotification = new Notification();
        Notification pushNotification = new Notification();

        emailNotification.sendEmail("user@example.com", "Hello World!");
        smsNotification.sendSMS("0123456789", "Hello World!");
        pushNotification.sendPushNotification("0123456789", "Hello World!");
    }
}
