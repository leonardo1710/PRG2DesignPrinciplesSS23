package at.ac.fhcampuswien.dependency_inversion;

public class Client {
    private Server server;

    public Client(Server server) {
        this.server = server;
    }

    public void sendData(String data) {
        server.sendData(data);
    }

    public void receiveData(String data) {
        server.receiveData(data);
    }
}
