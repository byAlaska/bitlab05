package bitlab.askar.module2.lesson7;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            Socket socket = new Socket("127.0.0.1", 2077);

            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            String name = in.next();
            PackageData pd;
            while (true) {

                String message = in.next();

                pd = new PackageData(name, message);
                outputStream.writeObject(pd);

                pd = (PackageData) inputStream.readObject();
                System.out.println(pd.message);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
