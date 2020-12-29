package bitlab.askar.module1.lesson9.practice;

import java.util.Arrays;

public class Staff extends User {

    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;

    public Staff() {
    }

    public Staff(int id, String login, String password, String name, String surname, double salary) {
        super(id, login, password, name, surname);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }


    public void addSubject(String subject){
        subjects[indexOfSubject] = subject;
        indexOfSubject++;
    }

    public int sizeOfSubjects(){
        return indexOfSubject;
    }


    @Override
    public String getUserData() {
        return "Staff{" +
                "salary=" + salary +
                ", subjects=" + Arrays.toString(subjects) +
                ", indexOfSubject=" + indexOfSubject +
                ", id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }



}
