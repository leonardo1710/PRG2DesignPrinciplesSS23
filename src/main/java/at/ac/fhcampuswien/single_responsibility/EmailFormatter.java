package at.ac.fhcampuswien.single_responsibility;

/**
 * Class that is responsible for formatting email body
 */
public interface EmailFormatter {

    public String format(String sender, String recipient, String body);


}
