package bitlab.askar.module2.lesson6;

public class Operation extends Thread {
    private String operationName;
    private int operationTime;

    public Operation(String operationName, int operationTime) {
        this.operationName = operationName;
        this.operationTime = operationTime;
    }

    @Override
    public void run() {
        try {
            System.out.println("Operation:" + operationName + " started!");
            for (int i=0;i<operationTime;i++){
                System.out.println("Operation:" + operationName + ": "+i+" second;");
                sleep(1000);
            }
            System.out.println("Operation:" + operationName + " is finished");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
