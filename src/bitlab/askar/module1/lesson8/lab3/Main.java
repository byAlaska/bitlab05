package bitlab.askar.module1.lesson8.lab3;

public class Main {
    public static void main(String []args){

        HDD hdd = new HDD(1000,2000,100);
        HDD hdd2 = new HDD(2000,4000,200);
        HDD hdd3 = new HDD(3000,6000,300);


        CPU cpu = new CPU(140,2000,50);
        CPU cpu2 = new CPU(280,5000,100);
        CPU cpu3 = new CPU(400,10000,150);

        CPU []cpus = {cpu,cpu2,cpu3};

        CPU cpu4 = new CPU(100,2000,50);
        CPU cpu5 = new CPU(300,4000,90);
        CPU cpu6 = new CPU(150,8000,80);

        CPU []cpus2 = {cpu4,cpu5,cpu6};


        Laptop laptop = new Laptop("HP",150000,2000,hdd, cpus);
        Laptop laptop2 = new Laptop("ASUS",200000,3000, hdd2, cpus2);


        System.out.println(laptop.getTotalCPUMemory());
        System.out.println(laptop.getTotalPrice());
        System.out.println(laptop.getTotalWeight());


        System.out.println(laptop2.getTotalCPUMemory());
        System.out.println(laptop2.getTotalPrice());
        System.out.println(laptop2.getTotalWeight());

    }
}
