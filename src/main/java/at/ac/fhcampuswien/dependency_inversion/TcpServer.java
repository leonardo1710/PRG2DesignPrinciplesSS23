package at.ac.fhcampuswien.dependency_inversion;

public class TcpServer implements IServer {

    @Override
    public void sendData(String data) {
        System.out.println(this.getClass().getSimpleName() + " Sending data: " + data);
    }

    @Override
    public void receiveData(String data) {
        System.out.println(this.getClass().getSimpleName() + " Receiving data: " + data);
    }
}
