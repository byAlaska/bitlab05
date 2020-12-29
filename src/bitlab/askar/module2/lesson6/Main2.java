package bitlab.askar.module2.lesson6;

public class Main2 {

    public static void main(String[] args) {

        Operation operation1 = new Operation("ADD CLIENT TO BANK", 4);
        Operation operation2 = new Operation("Go to bathroom", 5);
        Operation operation3 = new Operation("Make sandwiches", 10);

        operation1.start();
        operation2.start();
        operation3.start();
    }
}
