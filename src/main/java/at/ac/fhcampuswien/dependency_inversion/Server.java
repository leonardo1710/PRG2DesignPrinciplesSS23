package at.ac.fhcampuswien.dependency_inversion;

public class Server implements IServer {
    @Override
    public void sendData(String data) {
        System.out.println("Sending data: " + data);
    }

    @Override
    public void receiveData(String data) {
        System.out.println("Receiving data: " + data);
    }
}
