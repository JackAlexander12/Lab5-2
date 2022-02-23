package com.company;

public class Graduate extends Student{
    String c;
    int y;
    String d;
    int cr;
    public Graduate(String major, double GPA , int creditHours,String degree,String concentration, int years){
        super(major,GPA ,creditHours);
        //year is # of years spent in grad school
        this.cr = creditHours;
        this.d = degree;
        this.c = concentration;
        this.y = years;
    }
    public int getYear2(){
        return y;
    }
    public String getConcentration(){
        return c;
    }
    public String toString(){
        System.out.println("This student is going for a "+ d +" in "+ m+" with a concentration in "
                +getConcentration()+" .Their gpa is: "+G+".");
       return null;
    }
}
