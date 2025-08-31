import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter message to send to server: ");
            String msg = br.readLine();
            out.println(msg);

            out.close();
            br.close();
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
