package at.ac.fhcampuswien.open_closed;

/**
 * Application that sends notifications to users.
 * We want to be able to send notifications via different channels,
 * such as email, SMS, and push notifications.
 * However, we also want to be able to add new notification channels
 * in the future without modifying the existing code.
 *
 * The current implementation violates the Open-Closed Principle because
 * adding a new notification channel would require modifying the existing
 * Notification class.
 */
public class Notification {
    public void sendEmail(String recipient, String message) {
        // implementation for sending email notification
    }

    public void sendSMS(String recipient, String message) {
        // implementation for sending SMS notification
    }

    public void sendPushNotification(String recipient, String message) {
        // implementation for sending push notification
    }
}
