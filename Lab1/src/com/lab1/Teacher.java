package com.lab1;

public class Teacher {
    private static int numberOfTeachers = 0;

    protected boolean canBeBribed;
    protected boolean hasACar;

    private int age;
    private int teachExperience;
    private String name;
    private String surname;
    private String nickname;
    private String sex;

    public Teacher() {
        this("Name" , "Surname" , 9 , "Nickname" , 21 , "male" , false , true);
    }

    public Teacher(String name ,
                   String surname ,
                   int teachExperience ,
                   String nickname) {
        this(name , surname , teachExperience , nickname , 21 , "male" , false , true);
    }

    public Teacher(
            String name ,
            String surname ,
            int teachExperience ,
            String nickname ,
            int age ,
            String sex ,
            boolean canBe_Bribed ,
            boolean hasACar) {
        this.name = name;
        this.surname = surname;
        this.teachExperience = teachExperience;
        this.nickname = nickname;
        this.age = age;
        this.sex = sex;
        this.canBeBribed = false;
        this.hasACar = true;
        numberOfTeachers++;
    }

    public void setName(String line) {
        name = line;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String line) {
        surname = line;
    }

    public String getSurname() {
        return surname;
    }

    public void setNickname(String line) {
        nickname = line;
    }

    public String getNickname() {
        return nickname;
    }

    public void setAge(int value) {
        age = value;
    }

    public int getAge() {
        return age;
    }

    public void setTeachExperience(int value) {
        teachExperience = value;
    }

    public int getTeachExperience() {
        return teachExperience;
    }

    public void setSex(String line) {
        sex = line;
    }

    public String getSex() {
        return sex;
    }


    public String toString() {
        return "com.lab1.Teacher{" + "Name: " + name + "; "
            + "Surname: " + surname + "; "
            + "Teach experience: " + teachExperience + "; "
            + "Nickname: " + nickname + "; "
            + "Age: " + age + "; "
            + "Sex: " + sex + "; "
            + "Can be bribed: " + canBeBribed + "; "
            + "Has a car: " + hasACar + '}';
    }

    public void printValue() {
        printStaticValue();
    }

    static void printStaticValue() {
        System.out.println("Number of teachers: " + numberOfTeachers);
    }

    public void resetValues(String name ,
        String surname ,
        int teachExperience ,
        String nickname ,
        int age ,
        String sex ,
        boolean canBeBribed ,
        boolean hasACar) {
            this.name = name;
            this.surname = surname;
            this.teachExperience = teachExperience;
            this.nickname = nickname;
            this.age = age;
            this.sex = sex;
            this.canBeBribed = canBeBribed;
            this.hasACar = hasACar;
    }
}
