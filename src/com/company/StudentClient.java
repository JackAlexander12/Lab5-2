package com.company;

public class StudentClient {
    public static void main(String[] args){
        Undergraduate alex = new Undergraduate("CS", 3.9,54,true);
        alex.toString();
        alex.isHonors();
        Graduate Mary = new Graduate("Computer Science",3.91,0,"Masters","Data Science",1);
        Mary.toString();
        Exchange YingShu = new Exchange("Computer Science",4.0,0,true,"Taiwan","Fall","2020");
        YingShu.toString();
    }
}
