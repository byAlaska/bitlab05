package bitlab.askar.module2.lesson6.lab;

import java.util.ArrayList;

public class Main {
    public static void main(String []args){


        ArrayList<Car> cars = new ArrayList<>();
        ThreadGroup group = new ThreadGroup("group");
        Car car = new Car(group,"Ferrari",100,1000);
        Car car2 = new Car(group,"BMW",110,1000);
        Car car3 = new Car(group,"Renault",150,1000);
        Car car4 = new Car(group,"Lada",50,1000);
        Car car5 = new Car(group,"Mers",200,1000);

        cars.add(car);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        car.start();
        car2.start();
        car3.start();
        car4.start();
        car5.start();


        ArrayList<Car> finishedCars = new ArrayList<>();
        int count = group.activeCount();

        while (true){
            if (group.activeCount()<count){
                count--;
                for (Car c:cars){
                        if (!c.isAlive()){
                            System.out.println("HERE IS CAR FINISHED -> " + c.getName());
                            finishedCars.add(c);
                        cars.remove(c);
                        break;
                    }
                }
            }else if (count==0){
                break;
            }
        }

        for (int i=0;i<finishedCars.size();i++){
            System.out.println(finishedCars.get(i).getName() + " is no place -> " + i+1);
        }

    }
}
