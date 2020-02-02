package lesson16_H;

public class Employee {
    String name = "No name";
    String lastName = "No surname";
    int age;
    String status;
    boolean gender;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
    public Employee(String name, String lastName, int age,boolean gender){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
    public Employee (){ }

    public int getAge() {
        return age;
    }
    public void getInfo(){
        System.out.println("Name:" + name + "\nSurname:"+ lastName + "\nAge:" + age);
    }
}
