package bitlab.askar.module2.lesson9;

import java.util.ArrayList;

public class Main {
    public static void main(String []args){
        DBManager dbManager = new DBManager();
        dbManager.connect();

        dbManager.addCar(new Car(null, "Bugatti",40000,10));
        dbManager.addCar(new Car(null, "Ferrari",60000,5));

        ArrayList<Car> cars = dbManager.getAllCars();
        System.out.println(cars.toString());



    }
}
