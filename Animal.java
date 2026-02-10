 //over hiding in static method
 
 class Animal {
    public static void sound(){
        System.out.println("animal class");
    }
    
}
class Dog extends Animal{
    
    public static void sound(){
       
        System.out.println("dog barks");
    }

}
class Main{
    public static void main(String[] args) {
        Animal a= new Animal();
          
        Animal b=new Dog();
         Animal.sound();// Animal:Reference type
        
    }
}
