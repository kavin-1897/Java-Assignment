class Animal{  
    int legs;
    String Name;
void eat(){
   
    System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){
    System.out.println("barking...");}  
}  
class Cat extends Animal{  
void legs(){
    this.legs=4;
    System.out.println(legs);}  
}  

public class Client{  
public static void main(String args[]){  
Cat c=new Cat();  
c.legs();  


}
    
}  