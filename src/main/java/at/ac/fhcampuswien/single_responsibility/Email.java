package at.ac.fhcampuswien.single_responsibility;

public class Email {
    private String sender;
    private String recipient;
    private String body;

    public Email(String sender, String recipient, String body) {
        this.sender = sender;
        this.recipient = recipient;
        this.body = body;
    }

    public void send() {
        String emailContent = format(sender, recipient, body);

        // Implementation to send email
    }

    // Getters and setters

    private String format(String sender, String recipient, String body){
        StringBuilder sb = new StringBuilder();
        // Format the body with html
        sb.append("<html>");
        sb.append("<body>");
        sb.append("<p>");
        sb.append("Dear ").append(recipient).append(",");
        sb.append("</p>");
        sb.append("<p>");
        sb.append(body);
        sb.append("</p>");
        sb.append("<p>");
        sb.append("Best regards, ").append(sender);
        sb.append("</p>");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }
}
