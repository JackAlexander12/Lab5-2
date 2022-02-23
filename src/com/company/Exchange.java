package com.company;

public class Exchange extends Undergraduate{
    String s, seasons, y, Major;
    double g;
    public Exchange(String major, double GPA, int creditHours, Boolean h,String country,String season,String year) {
        super(major, GPA, creditHours, h);
        s=country;
        seasons= season;
        y= seasons + " " + year;
        g=GPA;
        Major = major;
    }
    public String getYear(){
        return y;
    }
    public String getCountry(){
        return s;
    }
    public String toString(){
        System.out.println("This student is from "+s + " and has achieved a " + g + " GPA while studying "+ Major+".");
        return null;
    }
}
