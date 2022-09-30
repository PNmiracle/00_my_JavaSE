import java.net.MalformedURLException;
import java.net.URL;

public class d_URL {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:8080/examples/beauty.jpg?username=Tom");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
