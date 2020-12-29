package bitlab.askar.module2.lesson7;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    public static void main(String []args){

        try {
            ServerSocket server = new ServerSocket(2077);

            ArrayList<String> strings  = new ArrayList<>();
            strings.add("Kafka");
            strings.add("Kafka");
            strings.add("Kafka");
            strings.add("Kafka");
            strings.add("Kafka");

            while (true){
                Socket socket = server.accept();
                ClientHandler clientHandler = new ClientHandler(socket);
                clientHandler.start();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
