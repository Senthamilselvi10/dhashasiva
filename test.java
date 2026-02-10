 //Rules of Method Overriding
//1.Method name must be same
//2.Parameters must be same
//3.Return type must be same (or covariant)
//4.Inheritance must be present
//5.Method must be non-static
//6.Access modifier cannot be more restrictive
 
 
class test {
    public void demo(){
        System.out.println("this is the demo() method ofthe test class");
    }
    
}
class test1 extends test{
    @Override
     public void demo(){
        System.out.println("this is the demo() method ofthe test1 class");
     }
}
 class methodoverriding{
    public static void main(String[] args) {
        test t1=new test1();
        t1.demo();
    }
 }