package org.example.oops_1;

public class student {
    int age;
    String name;
    float psp;
public student(int age,float psp){
    this.age=age;
    this.psp=psp;

}
    void changebatch(){
        System.out.println("changind batch");
    }
    void joinclass(){
        System.out.println(name+"is new to this batch");
    }
    void printdetails(){
        System.out.println("name is " + name);
        System.out.println("age is " +age);
    }
}
