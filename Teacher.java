public class Teacher {
    int age , teach_experiance;
    String name , surname , nickname , sex;

    public void SetName(String line){
        name = line;
    }
    public void SetSurname(String line){
        surname = line;
    }
    public void SetNickname(String line){
        nickname = line;
    }
    public void SetAge(int value){
        age = value;
    }
    public void SetTeach_experiance(int value){
        teach_experiance = value;
    }
    public void SetSex(String line){
        sex = line;
    }


    //This line was created to separete Set... and Get... methods


    public String GetName(){
        return name;
    }
    public String GetSurname(){
        return surname;
    }
    public String GetNickname(){
        return nickname;
    }
    public int GetAge(){
        return age;
    }
    public int GetTeach_experiance(){
        return teach_experiance;
    }
    public String GetSex(){
        return sex;
    }

    //###########################################################

    static int NumberOfTeachers = 0;
    protected boolean can_be_bribed;
    protected boolean has_a_car;

    public Teacher(){
        NumberOfTeachers++;
    }

    public Teacher(String name , String surname , int teach_experiance ,
                   String nickname){
        this.name = name;
        this.surname = surname;
        this.teach_experiance = teach_experiance;
        this.nickname = nickname;
        NumberOfTeachers++;
    }

    public Teacher(String name , String surname , int teach_experiance ,
                   String nickname , int age , String sex ,
                   boolean can_be_bribed , boolean has_a_car) {
        this(name , surname , teach_experiance , nickname);
        this.age = age;
        this.sex = sex;
        this.can_be_bribed = false;
        this.has_a_car = true;
        NumberOfTeachers++;
    }


    public void ToString(){
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Teach experiance: " + teach_experiance);
        System.out.println("Nickname: " + nickname);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + sex);
        System.out.println("Can be bribed: " + can_be_bribed);
    }

    static public void printValue(){
        System.out.println("Number of teachers: " + NumberOfTeachers);
    }

    public void resetValues(String name , String surname , int teach_experiance ,
                            String nickname , int age , String sex ,
                            boolean can_be_bribed , boolean has_a_car) {
        System.out.println(name + " " + surname + " " + teach_experiance +
                            " " + nickname + " " + age + " " +
                            sex + " " + can_be_bribed + " " + has_a_car);
    }

    public static void main(String[] args) {

    }
}
