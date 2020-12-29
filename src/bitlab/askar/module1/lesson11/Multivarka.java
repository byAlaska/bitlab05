package bitlab.askar.module1.lesson11;

public class Multivarka implements CanCharge, CanCook {
    @Override
    public void charge() {
        System.out.println("Multivarka is charging");
    }

    @Override
    public void cook() {
        System.out.println("Multivarka is cooking");
    }
}
