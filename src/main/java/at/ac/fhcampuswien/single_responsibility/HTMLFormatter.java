package at.ac.fhcampuswien.single_responsibility;

public class HTMLFormatter implements EmailFormatter{

    public String format(String sender, String recipient, String body){
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
