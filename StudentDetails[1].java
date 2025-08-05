package org.example.collection;

import java.util.ArrayList;
import java.util.List;

public class StudentDetails {

    public static void main(String[] args) {

        Student student = getStudentDetails();
        studentOperations(student);
        Student student1 = getStudentDetails1();
        studentOperations(student1);

    }
    private static Student getStudentDetails1()
    {
        Student student = new Student();
        student.setStudentId(2);
        student.setStudentName("Naveen");
        student.setMarks(5);
        return student;   
    }
    private static Student getStudentDetails() {
        Student student = new Student();
        student.setStudentId(1);
        student.setStudentName("Bhanu");
        student.setMarks(50);
        return student;
    }

    private static void studentOperations(Student student) {
        List<Student> studentArray = new ArrayList<>();

        //adding the student data
        studentArray.add(student);

        //02) View the elements from student
        System.out.println("Student details : " + studentArray);

        //03) Update the existing student details
        student.setMarks(10);
        System.out.println("Updated Student details : " + studentArray);

        //or alternate update method
        studentArray.get(0).setMarks(20);

        System.out.println("Updated Student details : " + studentArray);

        //Delete student object from this array
        studentArray.removeFirst();
        System.out.println("Removed Student details : " + studentArray);

        System.out.println("Student details array size : " + studentArray.size());




    }
}
