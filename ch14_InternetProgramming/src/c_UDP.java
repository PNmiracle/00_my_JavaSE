import org.junit.Test;

import java.io.IOException;
import java.net.*;

public class c_UDP {
    @Test
    public void testSender() throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        String str = "我是UDP方式发送的导弹";
        byte[] data = str.getBytes();
        InetAddress inet = InetAddress.getLocalHost();
        DatagramPacket datagramPacket = new DatagramPacket(data,0,data.length,inet,9090);

        datagramSocket.send(datagramPacket);

        datagramSocket.close();


    }

    @Test
    public void testReceiver() throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9090);

        byte[] buffer = new byte[100];
        DatagramPacket datagramPacket = new DatagramPacket(buffer,0 ,buffer.length);
        datagramSocket.receive(datagramPacket);

        System.out.println(new String(datagramPacket.getData(), 0, datagramPacket.getLength()));

        datagramSocket.close();
    }
}
