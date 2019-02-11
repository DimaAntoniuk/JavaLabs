package com.lab1;

public class Main {
    public static void main(String[] args) {
        Teacher Director = new Teacher(
                "Volodymyr" ,
                "Manuylov" ,
                10 ,
                "Vova" ,
                50 ,
                "male" ,
                true,
                true
        );

        Teacher oldTeacher = new Teacher(
                "Nickola" ,
                "Tesla" ,
                10 ,
                "Nick"
        );

        Teacher newTeacher = new Teacher();

        System.out.println(Director.ToString());
        System.out.println(oldTeacher.ToString());
        System.out.println(newTeacher.ToString());

        Director.printValue();
        Teacher.printStaticValue();
    }
}
