package bitlab.askar.module2.lesson7;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;


public class ClientHandler extends Thread {

    Socket socket;
    ArrayList<String> strings;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {

            Scanner in = new Scanner(System.in);
            System.out.println("CLient is conntected");

            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            PackageData pd;
            while (true){
                pd = (PackageData)inputStream.readObject();

                if (pd!=null){
                    System.out.println(pd.message);
                    pd.message = in.next();
                    outputStream.writeObject(pd);
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
