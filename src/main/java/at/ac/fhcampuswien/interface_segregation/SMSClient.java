package at.ac.fhcampuswien.interface_segregation;

public class SMSClient implements SMSNotificationService {
    @Override
    public void sendSMS(String phoneNumber, String message) {
        // send SMS
        System.out.println("SMS sent to " + phoneNumber + " with message " + message);
    }
}
