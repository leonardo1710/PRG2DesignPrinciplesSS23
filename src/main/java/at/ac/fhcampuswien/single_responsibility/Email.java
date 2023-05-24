package at.ac.fhcampuswien.single_responsibility;

public class Email {
    private String sender;
    private String recipient;
    private String body;
    private EmailFormatter formatter;

    public Email(String sender, String recipient, String body, EmailFormatter emailFormatter) {
        this.sender = sender;
        this.recipient = recipient;
        this.body = body;
        this.formatter = emailFormatter;
    }

    public void send() {
        String emailContent = formatter.format(sender, recipient, body);

        System.out.println(emailContent);

        // Implementation to send email
    }

    // Getters and setters
}
