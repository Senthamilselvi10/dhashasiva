 
interface printable{
    void display();
}
interface showable{
    void display();
}
class c implements printable,showable{
    public void display(){
System.out.println("c display");
    }
}
 public class Main{
    public static void main(String[] args) {
        c obj= new c();
         obj.display();
    }
 }