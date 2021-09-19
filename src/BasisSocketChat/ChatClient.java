package BasisSocketChat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) {


        String host = "localhost";
        int port = 8080;
        Scanner  input = new Scanner(System.in);

        try {
            Socket socket = new Socket(host,port);

            Scanner inStream = new Scanner(socket.getInputStream());
            PrintWriter outStream = new PrintWriter(socket.getOutputStream());

            new Thread(()-> {
                while(true){
                    System.out.println(inStream.nextLine());
                }
            }).start();

            while(true){
                outStream.println(input.nextLine());
                outStream.flush();
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }


    }









}
