package pis.hue2.Server;

import java.awt.*;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private List teilnehmer;
    private static final int PORT = 12345;

    public static void starteServer(int port){
        boolean serverIsRunning;
        try {
            ServerSocket  server = new ServerSocket(port);
            serverIsRunning = true;
            System.out.println("Server successfully started and listening on port "+port);

            while(serverIsRunning) {
                try {
                    Socket client = server.accept();
                    System.out.println("anfrage");
                    Thread clientHandler = new Thread("a");
                    clientHandler.start();

                } catch(IOException  e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        starteServer(PORT);
       }
       }