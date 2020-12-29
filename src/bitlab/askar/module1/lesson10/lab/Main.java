package bitlab.askar.module1.lesson10.lab;

import java.util.Scanner;

public class Main {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);

        User []users = new User[10];
        int count = 0;

        while (true){
            System.out.println("PRESS [1] ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [3] TO LIST BY ID");
            System.out.println("PRESS [0] TO EXIT");

            int choice = in.nextInt();
            if (choice==1){
                System.out.println("PRESS [1] TO ADD STUDENT\n" + "PRESS [2] TO ADD TEACHER");

                int choice2 = in.nextInt();

                System.out.println("ID:");
                int id = in.nextInt();
                System.out.println("LOGIN:");
                String login = in.next();
                System.out.println("PASSWORD:");
                String password = in.next();

                if (choice2==1){
                    System.out.println("Name:");
                    String name = in.next();
                    System.out.println("Surname");
                    String surname = in.next();
                    System.out.println("GROUP:");
                    String group = in.next();
                    System.out.println("GPA:");
                    double gpa = in.nextDouble();
                    Student student = new Student(id,login,password,name,surname,group,gpa);
                    users[count] = student;
                    count++;
                }else {
                    System.out.println("ENTER NICKNAME");
                    String nickName = in.next();
                    System.out.println("ENTER STATUS");
                    String status = in.next();
                    Teacher teacher = new Teacher(id,login,password,nickName,status);

                    while (true){
                        System.out.println("[1] ADD SUBJECT");
                        System.out.println("[0] EXIT");

                        int choice3 = in.nextInt();
                        if (choice3==1){
                            System.out.println("SUBJECT:");
                            String subject = in.next();
                            teacher.addSubject(subject);
                        }else {
                            break;
                        }
                    }
                    users[count] = teacher;
                    count++;
                }

            }else if(choice==2){
                System.out.println("[1] LIST STUDENTS");
                System.out.println("[2] LIST STAFF");

                int choice2 = in.nextInt();
                if (choice2==1){
                    for (int i=0;i<count;i++){
                        if (users[i] instanceof Student){
                            System.out.println(users[i].getUserData());
                        }
                    }
                }else {
                    for (int i=0;i<count;i++){
                        if (users[i] instanceof Teacher){
                            System.out.println(users[i].getUserData());
                        }
                    }
                }
            }else if (choice==3){
                System.out.println("ENTER ID:");
                int id = in.nextInt();

                for (int i=0;i<count;i++){
                    if (users[i].id==id){
                        System.out.println(users[i]);
                    }
                }
            }
            else {
                break;
            }
        }
    }
}
