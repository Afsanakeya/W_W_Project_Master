package Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Login_Time_Windows {
	
	public static void main(String[] args) throws Exception {
        Process p;
        StringBuilder sb = new StringBuilder();

        p = Runtime.getRuntime().exec("user");
        p.waitFor();

        BufferedReader reader
                = new BufferedReader(new InputStreamReader(p.getInputStream()));

        String line = "";
        while ((line = reader.readLine()) != null) {
            sb.append(line + "\n");
        }
        System.out.println(sb);
    }

}
