package bitlab.askar.module1.lesson8.lab3;

public class Laptop {

    String name;
    int price;
    int weight;
    HDD hardDiskDrive;
    CPU[] cpuMemory;


    public Laptop() {
    }

    public Laptop(String name, int price, int weight, HDD hardDiskDrive, CPU[] cpuMemory) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.hardDiskDrive = hardDiskDrive;
        this.cpuMemory = cpuMemory;
    }


    public int getTotalPrice(){

        int allPrice = 0;

        allPrice += this.price + hardDiskDrive.price;

        for (int i=0;i<cpuMemory.length;i++){
            allPrice += cpuMemory[i].price;
        }

        return allPrice;
    }

    public int getTotalWeight(){

        int allWeight = 0;

        allWeight += this.weight + hardDiskDrive.weight;

        for (int i=0;i<cpuMemory.length;i++){
            allWeight += cpuMemory[i].weight;
        }

        return allWeight;
    }

    public int getTotalCPUMemory(){

        int allCpuMemory = 0;
        for (int i=0;i<cpuMemory.length;i++){
            allCpuMemory += cpuMemory[i].cashMemory;
        }

        return allCpuMemory;
    }

}
