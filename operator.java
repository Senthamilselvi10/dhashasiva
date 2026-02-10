// operators: it do some operation based on the operand.
//             perform mathematical calculations

 //arithmetic operators

class operator {
    public static void main(String[]args){

    
    int a=25;
    int b=4;
    System.out.println("addition:"+(a+b));
     System.out.println("subtraction:"+(a-b));
     System.out.println("multiplication:"+(a*b));
     System.out.println("division:"+(a/b));
     System.out.println("modulus:"+(a%b));
 
    //assignment operator
    int n=10;
    n+=5;
    System.out.println("Addition :"+ n);
    n-=3;
    System.out.println("Subtraction :"+ n);
    n*=2;
    System.out.println("Multiplication :" +n);
    n/=2;
    System.out.println("Divisiom  :" +n);

    //Relational operator:used to compare two values,it return value as boolean.
      int c=7;
      int d=5;
      System.out.println("c==d:" +(c==d));
      System.out.println("c!=d:" +(c!=d));
      System.out.println("c>d:" +(c>d));
      System.out.println("c<d:" +(c<d));
      System.out.println("c>=d:" +(c>=d));
      System.out.println("c<=d:" +(c<=d));

    //Logical operator:it is used to combine two or more condition ,it also return boolean.
    int x=20;
    int y=30;
    boolean z=true;
    System.out.println(x>10&&x<50);
    System.out.println(y%5==0||y%3==0);
    System.out.println(!z);

   //Bitwise operator:it works on binary values(0 and 1),perform operations bit by bit
     int u=5;
     int v=3;
     System.out.println(u&v);
     System.out.println(u|v);
     System.out.println(4<<1);
     System.out.println(8>>1 );
     System.out.println(u^v);
  //increment and decrement

     System.out.println(u++); //post increment
     System.out.println(v--); // post decrement
     System.out.println(++u); // pre increment 
     System.out.println(--v); //pre decrement
}
}
