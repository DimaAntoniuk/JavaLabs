package com.lab1;

public class Main {
    public static void main(String[] args) {
        Teacher director = new Teacher("Volodymyr", "Manuylov", 10,
                "Vova", 50, "male", true, true);

        Teacher oldTeacher = new Teacher("Nickola" , "Tesla" , 10 , "Nick");

        Teacher newTeacher = new Teacher();

        System.out.println(director.toString());
        System.out.println(oldTeacher.toString());
        System.out.println(newTeacher.toString());

        director.printValue();
        Teacher.printStaticValue();
    }
}
