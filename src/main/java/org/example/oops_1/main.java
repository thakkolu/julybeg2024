package org.example.oops_1;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {
        student s1=new student(26,69.8f);
        s1.psp=99.8f;
        s1.changebatch();
        System.out.println(s1.psp);
        s1.joinclass();
        s1.printdetails();



    }



}
