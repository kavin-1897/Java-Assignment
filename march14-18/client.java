 class Vehicle {
    int speed=50;
    int wheels=4;
    String Brand="audi";
    public void start() 
    {
      System.out.println("Vehicle start code");
    }
}

 class Car extends Vehicle {
    public void start() {
        this.speed=50;
      System.out.println("car speed "+speed);
  }
}
public class client{
    public static void main(String args[]){

Car car = new Car();
car.start(); 

}
}