package bitlab.askar.module1.lesson11;

public class ElectroCar implements CanCharge{

    int weight;
    String name;
    int voltage;


    @Override
    public void charge() {
        System.out.println("Electro car is charging");
    }
}
