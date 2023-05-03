package at.ac.fhcampuswien.dependency_inversion;

public class App {
    public static void main(String[] args) {
        Server server = new Server();
        Client client = new Client(server);

        client.sendData("Hello World!");
        client.receiveData("Hello World!");

        TcpServer tcpServer = new TcpServer();
        Client tcpClient = new Client(tcpServer);

        tcpClient.sendData("Hello World!");
        tcpClient.receiveData("Hello World!");

        UdpServer udpServer = new UdpServer();
        Client udpClient = new Client(udpServer);
        udpClient.sendData("Hello World!");
        udpClient.receiveData("Hello World!");

        // when adding a new server class client does not need to be changed
    }
}
