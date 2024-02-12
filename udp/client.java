import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.DatagramPacket;

import java.io.IOException;

public class client{
    
    public static void main(String[] args) {
        try{
            DatagramSocket soc = new DatagramSocket();
            InetAddress servIp = InetAddress.getByName("127.0.0.1");
            String mssg="za3ma yousel kemel w mestwi b udp ? ";
            byte[] mssgB= mssg.getBytes();
            DatagramPacket pac= new DatagramPacket(mssgB, mssgB.length, servIp, 12345);
            soc.send(pac);
            soc.close();
        }
        catch(IOException e){
            System.out.println(e);
        }

    }
}