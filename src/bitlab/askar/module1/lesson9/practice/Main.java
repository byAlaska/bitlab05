package bitlab.askar.module1.lesson9.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);

        ArrayList<User> users = new ArrayList<>();

        while (true){
            System.out.println("PRESS [1] ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [3] TO LIST BY ID");
            System.out.println("PRESS [0] TO EXIT");

            int choice = in.nextInt();
            if (choice==1){
                System.out.println("PRESS [1] TO ADD STUDENT\n" + "PRESS [2] TO ADD STAFF");

                int choice2 = in.nextInt();

                System.out.println("ID:");
                int id = in.nextInt();
                System.out.println("LOGIN:");
                String login = in.next();
                System.out.println("PASSWORD:");
                String password = in.next();
                System.out.println("NAME:");
                String name = in.next();
                System.out.println("SURNAME:");
                String surname = in.next();


                if (choice2==1){
                    System.out.println("GPA:");
                    double gpa = in.nextDouble();
                    Student student = new Student(id,login,password,name,surname,gpa);

                    while (true){
                        System.out.println("[1] ADD COURSE");
                        System.out.println("[0] EXIT");

                        int choice3 = in.nextInt();
                        if (choice3==1){
                            System.out.println("COURSE:");
                            String course = in.next();
                            student.addCourse(course);
                        }else {
                            break;
                        }
                    }
                    users.add(student);
                }else {
                    System.out.println("SALARY:");
                    double salary = in.nextDouble();
                    Staff staff = new Staff(id,login,password,name,surname,salary);

                    while (true){
                        System.out.println("[1] ADD SUBJECT");
                        System.out.println("[0] EXIT");

                        int choice3 = in.nextInt();
                        if (choice3==1){
                            System.out.println("SUBJECT:");
                            String subject = in.next();
                            staff.addSubject(subject);
                        }else {
                            break;
                        }
                    }
                    users.add(staff);
                }


            }else if(choice==2){
                System.out.println("[1] LIST STUDENTS");
                System.out.println("[2] LIST STAFF");

                int choice2 = in.nextInt();
                if (choice2==1){
                    for (int i=0;i<users.size();i++){
                        if (users.get(i) instanceof Student){
                            System.out.println(users.get(i).toString());
                        }
                    }
                }else {
                    for (int i=0;i<users.size();i++){
                        if (users.get(i) instanceof Staff){
                            System.out.println(users.get(i).toString());
                        }
                    }
                }
            }else if (choice==3){
                System.out.println("ENTER ID:");
                int id = in.nextInt();

                for (int i=0;i<users.size();i++){
                    if (users.get(i).id==id){
                        System.out.println(users.get(i));
                    }
                }
            }
            else {
                break;
            }
        }


    }
}
