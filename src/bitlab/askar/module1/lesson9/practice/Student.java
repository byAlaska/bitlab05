package bitlab.askar.module1.lesson9.practice;

import java.util.Arrays;

public class Student extends User {

    private double gpa;
    private String courses[] = new String[10];
    private int indexOfCourses = 0;

    public Student() {
    }


    public Student(int id, String login, String password, String name, String surname, double gpa) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public int sizeOfCourses(){
        return indexOfCourses;
    }

    public void addCourse(String course){
        courses[indexOfCourses] = course;
        indexOfCourses++;
    }

    @Override
    public String getUserData() {
        return "Student{" +
                "gpa=" + gpa +
                ", courses=" + Arrays.toString(courses) +
                ", id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
