package at.ac.fhcampuswien.dependency_inversion;

public interface IServer {
    void sendData(String data);
    void receiveData(String data);
}
