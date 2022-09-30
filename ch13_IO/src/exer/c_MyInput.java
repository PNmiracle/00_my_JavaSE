package exer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c_MyInput {
    public static String readString() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return str;
    }

    public static int readInt(){
        return Integer.parseInt(readString());
    }
}
