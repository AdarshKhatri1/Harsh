package com.company;

import javax.management.ObjectName;

public class Student {

    int roll;
    String name;
    int marks;
    String grade;

    Student(){

    }

    Student(int r,String n,int m){
        this.marks = m;
        this.name = n;
        this.roll = r;
        this.grade ="not applicable";
    }

    Student(int r,String n,int m , String grade){
        this.marks = m;
        this.name = n;
        this.roll = r;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", grade='" + grade + '\'' +
                '}';
    }

    public static void main(String[] args) {

//        Object == tostring
        Student student = new Student(1,"adrsh",100,"A+");


        System.out.println(student);

        Student student1 = new Student(2,"harsh",100);

        student1.roll = 2;
        student1.name = "harsh";
        student1.marks = 100;

        System.out.println(student1);



    }

}
