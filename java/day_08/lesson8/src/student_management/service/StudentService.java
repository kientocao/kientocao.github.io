package student_management.service;

import student_management.model.Student;

import java.util.Random;
import java.util.Scanner;

public class StudentService {
    public Student createStudent() {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Name = ");
        String name = sc.nextLine();
        System.out.println("Enter theoryPoint ");
        double theoryPoint = sc.nextDouble();
        System.out.println("Enter praticePoint");
        double practicePoint = sc.nextDouble();
        int id = (int) Math.floor(Math.random()*100);
        Student std = new Student (id,name,theoryPoint, practicePoint);
        return std;
    }
    public double calculateAvgPoint(double theoryPoint, double practicePoint) {
        return (theoryPoint + practicePoint) /2;
    }
    public void printInfo(Student s) {
        System.out.println("id: " +s.id);
        System.out.println("name " + s.name);
        System.out.println("theoryPoint " + s.theoryPoint);
        System.out.println("praticePoiont " + s.praticePoint);
        System.out.println("avgPoint " + calculateAvgPoint(s.theoryPoint,s.praticePoint));
    }
}
