package lesson16_H;

import java.sql.SQLOutput;

public class HumanResources extends Employee{
        int number;
        public HumanResources(){}
        public HumanResources(String name,String lastName, int age,int number,boolean gender){
            super(name, lastName, age, gender);
            this.number = number;
        }

    public int getNumber() {
        return number;
    }
    public String get (){
            return name;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public void  getGender(){
            if(gender){
                System.out.println("Gender: Male");
            }else
                System.out.println("Gender:Female");
    }
    @Override
    public void getInfo(){
            System.out.print("HR");
    }

}
