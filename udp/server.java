import java.net.DatagramSocket;
import java.net.DatagramPacket;

import java.io.IOException;

public class server{
    
    public static void main(String[] args) {
        try{
            DatagramSocket soc = new DatagramSocket(12345);
            byte[] buffer= new byte[1024];
            DatagramPacket pac= new DatagramPacket(buffer, buffer.length);
            soc.receive(pac);
            String mssg= new String (pac.getData(),0,pac.getLength());
            System.out.println(mssg);
            soc.close();
        }
        catch(IOException e){
            System.out.println(e);
        }

    }
}