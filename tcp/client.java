package tcp;
import java.io.*;
import java.net.Socket;

public class client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345); 
            OutputStream output= socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            writer.println("njarbou TCP trah");
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
