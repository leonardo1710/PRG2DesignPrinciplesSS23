package at.ac.fhcampuswien.interface_segregation;

public class EmailClient implements EmailNotificationService {
    @Override
    public void sendEmail(String address, String subject, String message) {
        // send email
        System.out.println("Email sent to " + address + " with subject " + subject + " and message " + message);
    }
}
