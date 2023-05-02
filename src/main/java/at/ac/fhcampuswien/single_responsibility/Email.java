package at.ac.fhcampuswien.single_responsibility;

public class Email {
    private String sender;
    private String recipient;
    private String body;
    private EmailFormatter formatter;

    public Email(String sender, String recipient, String body) {
        this.sender = sender;
        this.recipient = recipient;
        this.body = body;
        this.formatter = new EmailFormatter();
    }

    public void send() {
        String emailContent = formatter.format(sender, recipient, body);

        // Implementation to send email
    }

    // Getters and setters
}
