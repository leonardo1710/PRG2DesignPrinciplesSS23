package at.ac.fhcampuswien.single_responsibility;

public class App {
    public static void main(String[] args) {
        // user selects formatting

        EmailFormatter myFormat = new HTMLFormatter();

        // formatting
        Email email = new Email("alice", "bob", "How are you today? Don't forget to do your design patterns ;).", myFormat);
        email.send();
    }
}
