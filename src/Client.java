
import java.io.*;
import java.net.*;

public class Client {

    public static boolean first_join = true;
    public static String role;

    public static void main(String[] args) {

        try {
            Socket s = new Socket("127.0.0.1", 23410);
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter pw = new PrintWriter(s.getOutputStream());
            if (first_join == true) {
                pw.println("join");
                pw.flush();
                String msg_role = br.readLine();
                role = msg_role;
                System.out.println("you are " + role);
              br.close();
//                pw.close();
//                s.close();
                first_join = false;

            } else {
                pw.println(role + "\n" + "POSITION1");
                pw.flush();
               br.close();
//                pw.close();
//                s.close();
            }

        } catch (Exception e) {

            e.printStackTrace();
        }

    }


}
