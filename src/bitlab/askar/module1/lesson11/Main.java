package bitlab.askar.module1.lesson11;


import java.util.ArrayList;

public class Main {
    public static void main(String []args){


        System.out.println("HEllo");


        Multivarka multivarka = new Multivarka();
        ElectroCar car = new ElectroCar();
        Telephone telephone = new Telephone();


        ArrayList<CanCharge> canCharges2 = new ArrayList<>();
        canCharges2.add(multivarka);
        canCharges2.add(car);
        canCharges2.add(telephone);


        CanCharge[] canCharges = {multivarka,car,telephone};


        for (int i=0;i<3;i++){
            canCharges[i].charge();
        }

    }
}
