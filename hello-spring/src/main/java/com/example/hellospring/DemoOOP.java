package com.example.hellospring;

public class DemoOOP {

    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee);

        if(employee instanceof Object){
            System.out.println("employee instanceof Object");
        }

        Employee employee1 = new Employee(1,"Thana");
        Employee employee2 =new Employee(1,"Thana");
        System.out.println("employee 1 : " +  employee1);
        System.out.println("employee 2 : " +  employee1);

        if(employee1.equals(employee2)){
            System.out.println("Equals");

        }else {
            System.out.println("Not Equals");
        }
    }
}
