package lesoon16;

public class Car {
    /*private int doors;*/
    private String model;
    private int speed = 0;
    public Car(){ }
    public Car(String a){
        this.model = a;
    }
    public void addSpeed(int speed){
        this.speed = this.speed + speed;
        System.out.println(getInfo());
    }
    private int getInfo(){
        return this.speed;
    }
//    :@Override
//    Overloading
}
