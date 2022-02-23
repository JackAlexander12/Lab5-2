package com.company;

public class Student {
    String m;
    double G;
    int c;
    public Student(String major, double GPA , int creditHours){
        this.m = major;
        this.G = GPA;
        this.c=creditHours;
    }
    public double getGPA(){
        return G;
    }
    public String getYear(){
        String a;
        if(c >= 96){
            a = "senior";
        }
        else if(c>=64){
            a="junior";
        }
        else if(c>=32){
            a="sophmore";
        }
        else{
            a="freshman";
        }
        return a;
    }
    public String toString(){
        System.out.println("This student is a "+ getYear() +"student and their GPA is: "+G+".");
        return null;
    }
}
