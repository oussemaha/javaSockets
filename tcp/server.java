package tcp;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSoc = new ServerSocket(12345); 
            System.out.println("Waiting for a client...");
            Socket clientSoc = serverSoc.accept();

            InputStream input = clientSoc.getInputStream();

            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            String receivedMessage = reader.readLine();
            System.out.println( receivedMessage);


            clientSoc.close();
            serverSoc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
