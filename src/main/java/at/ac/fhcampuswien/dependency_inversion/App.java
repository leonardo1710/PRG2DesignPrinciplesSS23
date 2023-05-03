package at.ac.fhcampuswien.dependency_inversion;

public class App {
    public static void main(String[] args) {
        Server server = new Server();
        Client client = new Client(server);

        client.sendData("Hello World!");
        client.receiveData("Hello World!");
    }
}
