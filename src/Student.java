import java.util.Scanner;

public class Student {
    int id;
    String name;
    String className;
    String gender;
    int age;
    float score;
    public Student(){

    }

    public Student(int id, String name, String className, String gender, int age, float score) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.gender = gender;
        this.age = age;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public  void showInfo(){
        System.out.println("Id"+id);
        System.out.println("Name:"+name);
        System.out.println("Class Name:"+className);
        System.out.println("Gender is:"+gender);
        System.out.println("Age:"+age);
        System.out.println("Score"+score);
    }
    void input(Scanner input){
        boolean isValid=false;
        do {
            System.out.println("Enter Id:");
            String strId;
            try {
                strId=input.next();
                id=Integer.parseInt(strId);
                isValid=true;
            }catch (Exception ex){
                System.out.println("Invalid formate");
            }
        }while (!isValid);
        System.out.println("Enter Name:");
        input.nextLine();
        name=input.nextLine();
        System.out.println("Enter Class name:");
        gender=input.nextLine();
        System.out.println("Enter gender:");
        gender=input.nextLine();
        System.out.println("Enter age:");
        age=input.nextInt();
        System.out.println("Enter Score:");
        score=input.nextFloat();
    }
}
