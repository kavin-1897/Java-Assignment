public class Biker
{
    public static void main(String s[])
    {
        Bike bike = new Bike();
        bike.mileage = 72.5;
        bike.diskBrakes = false;

        System.out.println(bike.company + " " + bike.model + "  " + bike.cc + "");
    }
}

 class Bike
{
  

    Bike()
    {
    }

    String company;
    String model;
    int cc;
    double mileage;
    boolean diskBrakes;
}