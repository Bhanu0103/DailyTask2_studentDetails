package org.example.collection;

public class Student {
    private int studentId;
    private String studentName;

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", marks=" + marks +
                '}';
    }

    private int marks;

    //setter for student id
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    //setter for student name
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    //setter for student marks
    public void setMarks(int marks) {
        this.marks = marks;
    }

    //getter for student id
    public int getStudentId() {
        return studentId;
    }

    //getter for student name
    public String getStudentName() {
        return studentName;
    }

    //getter for student marks
    public int getMarks() {
        return marks;
    }


}
