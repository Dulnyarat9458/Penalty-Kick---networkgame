
import java.io.*;
import static java.lang.System.exit;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;

public class Server extends Thread {

    public static boolean playable = true;
    public static int player1_score = 0;
    public static int player2_score = 0;
    public static int turn = 1;

    Socket s1 = null;
    Socket s2 = null;

    public Server(Socket s1, Socket s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public void run() {
        try {
            Random rand = new Random();
            /////////////////////////////////////////////////////////////////////////////////
            BufferedReader br1 = new BufferedReader(
                    new InputStreamReader(
                            s1.getInputStream()));
            PrintWriter pw1 = new PrintWriter(s1.getOutputStream());
            /////////////////////////////////////////////////////////////////////////////////
            BufferedReader br2 = new BufferedReader(
                    new InputStreamReader(
                            s2.getInputStream()));
            PrintWriter pw2 = new PrintWriter(s2.getOutputStream());
            /////////////////////////////////////////////////////////////////////////////////

            String p1_action = br1.readLine();
            String p2_action = br2.readLine();

            System.out.println("p1_action: " + p1_action);
            System.out.println("p2_action : " + p2_action);
            System.out.println("TURN " + turn);
            pw1.println(turn);
            pw2.println(turn);
            if (turn <= 5) {
                if (p1_action.equals(p2_action)) {
                    pw1.println("goal keeper can save.");
                    pw2.println("you can save!");
                    pw1.println(player1_score);
                    pw2.println(player1_score);
                    pw1.println(player2_score);
                    pw2.println(player2_score);
                }
                if (!p1_action.equals(p2_action)) {
                    int int_random = rand.nextInt(100);
                    System.out.println("random: " + int_random);
                    if (int_random >= 0 && int_random < 35) {

                        pw1.println("you shoot fail!");
                        pw2.println("ball is out of goal.");
                        pw1.println(player1_score);
                        pw2.println(player1_score);
                        pw1.println(player2_score);
                        pw2.println(player2_score);

                    } else {
                        player1_score = 1 + player1_score;
                        pw1.println("you scored!");
                        pw2.println("you can't save.");
                        pw1.println(player1_score);
                        pw2.println(player1_score);
                        pw1.println(player2_score);

                        pw2.println(player2_score);
                    }
                }
            } else if (turn > 5 && turn <= 10) {
                if (p1_action.equals(p2_action)) {
                    pw1.println("you can save!");
                    pw2.println("goal keeper can save.");
                    pw1.println(player1_score);
                    pw2.println(player1_score);
                    pw1.println(player2_score);
                    pw2.println(player2_score);
                }
                if (!p1_action.equals(p2_action)) {
                    int int_random = rand.nextInt(100);
                    System.out.println("random: " + int_random);
                    if (int_random >= 0 && int_random < 35) {
                        pw1.println("ball is out of goal.");
                        pw2.println("you shoot fail!");
                        pw1.println(player1_score);
                        pw2.println(player1_score);
                        pw1.println(player2_score);
                        pw2.println(player2_score);
                    } else {
                        player2_score = 1 + player2_score;
                        pw1.println("you can't save.");
                        pw2.println("you scored!");
                        pw1.println(player1_score);
                        pw2.println(player1_score);
                        pw1.println(player2_score);
                        pw2.println(player2_score);

                    }

                }
            }
            pw1.println(turn + 1);
            pw2.println(turn + 1);
            System.out.println("p1: " + player1_score);
            System.out.println("p2: " + player2_score);
            turn++;

            if (turn > 10) {
                if (player1_score > player2_score) {
                    System.out.println("player 1 WIN !");
                    pw1.println("player 1 WIN !");
                    pw2.println("player 1 WIN !");
                } else if (player1_score < player2_score) {
                    System.out.println("player 2 WIN !");
                    pw1.println("player 2 WIN !");
                    pw2.println("player 2 WIN !");
                } else {
                    pw1.println("DRAW !!");
                    pw2.println("DRAW !!");
                    System.out.println("DRAW !!");

                }
            }
            pw1.flush();
            pw1.close();
            br1.close();
            s1.close();
            pw2.flush();
            pw2.close();
            br2.close();
            s2.close();

        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        System.out.println("SERVER IS RUNNING.....");
        ServerSocket server = null;
        ExecutorService es = Executors.newFixedThreadPool(15);
        try {
            server = new ServerSocket(23410);
        } catch (Exception e) {
            e.printStackTrace();
        }

        while (true) {
            try {

                /////////////////////////////////////////////////////////////////////////////////
                Socket s1 = server.accept();
                System.out.println("player 1 is Ready");
                System.out.println("waiting for other player");

                BufferedReader br_ready_1 = new BufferedReader(
                        new InputStreamReader(
                                s1.getInputStream()));
                PrintWriter pw1 = new PrintWriter(s1.getOutputStream());
                // String s1_ready = br_ready_1.readLine();

                Socket s2 = server.accept();
                System.out.println("player 2 is Ready");
                BufferedReader br_ready_2 = new BufferedReader(
                        new InputStreamReader(
                                s2.getInputStream()));
                PrintWriter pw2 = new PrintWriter(s2.getOutputStream());
                //  String s2_ready = br_ready_2.readLine();

//                System.out.println("ready to play");
//                pw1.flush();
//                pw1.close();
//                br_ready_1.close();
//                s1.close();
//                pw2.flush();
//                pw2.close();
//                br_ready_2.close();
//                s2.close();
                Server serverThread = new Server(s1, s2);
                es.execute(serverThread);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
