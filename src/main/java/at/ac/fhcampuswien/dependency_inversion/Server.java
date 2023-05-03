package at.ac.fhcampuswien.dependency_inversion;

public class Server {
    public void sendData(String data) {
        System.out.println("Data sent: " + data);
    }

    public void receiveData(String data) {
        System.out.println("Data received: " + data);
    }
}
