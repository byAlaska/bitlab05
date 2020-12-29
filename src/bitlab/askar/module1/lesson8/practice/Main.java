package bitlab.askar.module1.lesson8.practice;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);

        Student []students = new Student[10];
        int sizeOfStudents = 0;



        while (true){
            System.out.println("PRESS [1] TO ADD STUDENT\n" +
                    "PRESS [2] TO LIST STUDENT\n" +
                    "PRESS [0] TO EXIT");

            int choice = in.nextInt();


            if (choice==1){
                System.out.println("Insert id");
                int id = in.nextInt();
                System.out.println("Insert name");
                String name = in.next();
                System.out.println("Insert surname");
                String surname = in.next();
                System.out.println("insert gpa");
                double gpa = in.nextDouble();

                Student student = new Student(id,name,surname,gpa);
                students[sizeOfStudents] = student;
                sizeOfStudents++;
            }else if (choice==2){
                for (int i=0;i<sizeOfStudents;i++){
                    System.out.println(students[i].toString());
                }
            }else {
                break;
            }
        }





    }


    public static Student topStudent(Student []students){

        Student bestStudent = students[0];
        double maxGpa = students[0].gpa;

        for (int i=0;i<students.length;i++){
            if (maxGpa < students[i].gpa){
                maxGpa = students[i].gpa;
                bestStudent = students[i];
            }
        }

        return bestStudent;
    }
}
