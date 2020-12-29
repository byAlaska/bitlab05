package bitlab.askar.module2.lesson5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);

        Game game = null;

        while (true) {
            System.out.println("[1] Create game");
            System.out.println("[2] add player");
            System.out.println("[3] play game");
            System.out.println("[4] exit");

            int choice = in.nextInt();

            if (choice == 1) {
                String gameName = in.next();
                String ipAddress = in.next();
                int port = in.nextInt();
                game = new Game(gameName, ipAddress, port);
                saveGame(game);
            } else if (choice == 2) {
                if (game != null) {
                    String name = in.next();
                    String club = in.next();
                    int price = in.nextInt();

                    Player player = new Player(name, club, price);
                    game.addPlayer(player);
                    saveGame(game);
                } else {
                    System.out.println("You didn't created game");
                }
            }else if(choice==3){
                System.out.println(play());
            }else {
                break;
            }
        }

    }

    public static void saveGame(Game game){
        try {

            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("test.txt"));
            outputStream.writeObject(game);
            outputStream.close();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Game play(){
        Game game = null;

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("test.txt"));
            game = (Game) inputStream.readObject();
            inputStream.close();
        }catch (Exception e) {
            e.printStackTrace();
        }

        return game;
    }
}
