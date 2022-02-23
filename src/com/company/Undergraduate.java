package com.company;

public class Undergraduate extends Student{
    Boolean Honors;
    public Undergraduate(String major, double GPA, int creditHours,Boolean h) {
        super(major, GPA, creditHours);
        this.Honors = h;
    }
    public boolean isHonors(){
        return Honors;
    }
    public String toString(){
        if(isHonors()==true) {
            System.out.println("This student is a " + getYear() + " honors student and their GPA is " + G + ".");
        }
        else{
            System.out.println("This student is a "+ getYear() +" student and their GPA is "+G+".");
        }
        return null;
    }
}
