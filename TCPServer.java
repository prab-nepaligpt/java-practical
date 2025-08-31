import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5000);
            System.out.println("Server started. Waiting for client...");
            
            Socket client = server.accept();
            System.out.println("Client connected: " + client.getInetAddress());

            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

            String msg = in.readLine();
            System.out.println("Received from client: " + msg);

            in.close();
            client.close();
            server.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
