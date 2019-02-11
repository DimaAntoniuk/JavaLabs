package com.lab1;

public class Teacher {
    private static int NumberOfTeachers = 0;

    protected boolean can_be_bribed;
    protected boolean has_a_car;

    private int age;
    private int teach_experiance;
    private String name;
    private String surname;
    private String nickname;
    private String sex;


    public void SetName(String line) {
        name = line;
    }

    public String GetName() {
        return name;
    }

    public void SetSurname(String line) {
        surname = line;
    }

    public String GetSurname() {
        return surname;
    }

    public void SetNickname(String line) {
        nickname = line;
    }

    public String GetNickname() {
        return nickname;
    }

    public void SetAge(int value) {
        age = value;
    }

    public int GetAge() {
        return age;
    }

    public void SetTeach_experiance(int value) {
        teach_experiance = value;
    }

    public int GetTeach_experiance() {
        return teach_experiance;
    }

    public void SetSex(String line) {
        sex = line;
    }

    public String GetSex() {
        return sex;
    }

    //##################################################################################################################


    public Teacher() {
        this("Name" , "Surname" , 9 , "Nickname" , 21 , "male" , false , true);
    }

    public Teacher(String name ,
                   String surname ,
                   int teach_experiance ,
                   String nickname) {
        this(name , surname , teach_experiance , nickname , 21 , "male" , false , true);
    }

    public Teacher(
        String name ,
        String surname ,
        int teach_experiance ,
        String nickname ,
        int age ,
        String sex ,
        boolean can_be_bribed ,
        boolean has_a_car) {
            this.name = name;
            this.surname = surname;
            this.teach_experiance = teach_experiance;
            this.nickname = nickname;
            this.age = age;
            this.sex = sex;
            this.can_be_bribed = false;
            this.has_a_car = true;
            NumberOfTeachers++;
    }

    //##################################################################################################################

    public String ToString() {
        return "com.lab1.Teacher{" + "Name: " + name + "; "
            + "Surname: " + surname + "; "
            + "Teach experiance: " + teach_experiance + "; "
            + "Nickname: " + nickname + "; "
            + "Age: " + age + "; "
            + "Sex: " + sex + "; "
            + "Can be bribed: " + can_be_bribed + '}';
    }

    public void printValue() {
        printStaticValue();
    }

    static void printStaticValue() {
        System.out.println("Number of teachers: " + NumberOfTeachers);
    }

    public void resetValues(String name ,
        String surname ,
        int teach_experiance ,
        String nickname ,
        int age ,
        String sex ,
        boolean can_be_bribed ,
        boolean has_a_car) {
            System.out.println("Name: " + name + '\n'
                + "Surname: " + surname + '\n'
                + "Teach experiance: " + teach_experiance + '\n'
                + "Nickname: " + nickname + '\n'
                + "Age: " + age + '\n'
                + "Sex: " + sex + '\n'
                + "Can be bribed: " + can_be_bribed + '\n'
                + "Has a car: " + has_a_car);
    }
}
