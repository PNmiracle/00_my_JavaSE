import java.net.InetAddress;
import java.net.UnknownHostException;

public class a_InetAddress {
    public static void main(String[] args) {
        try {
            InetAddress inet1 = InetAddress.getByName("192.168.10.14");
            System.out.println("inet1 = " + inet1);

            InetAddress inet2 = InetAddress.getByName("www.google.com");
            System.out.println("inet2 = " + inet2);

            InetAddress inet3 = InetAddress.getByName("localhost");
            System.out.println("inet3 = " + inet3);

            InetAddress inet4 = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
