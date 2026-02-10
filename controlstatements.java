  //control statements are used to control the flow of execution of a program.
    // types of control statements
    // 1.Decision-Making /Conditional Statements(if, if-else,else-if(ladder),nested if ,switch)
    // 2.Looping /Iterative Statements(for,while,do-while,nested for)
    // 3.Jump /Branching Statements(break ,continue,return)

// if :syntax
    // if(condition){
    //     Block of code to be executed;
    //    }
    
    class controlstatements {
        public static void main(String[] args) {
          int a=12;
          int b=7;
          if(a>b){
            System.out.println("a is greater than b");
           } 


           

    // if-else:syntax
    // if(condition){
    //     Block of code to be executed;
    //    }
    //  else{
    //     Block of code to be executed;
    //   }
     int n=7;
     if(n%2==0){
         System.out.println("even number");
     }
     else{
        System.out.println("odd number");
     }
       
     //else-if:check multiple condition one by one
     // syntax
       // if(condition){
    //     Block of code to be executed;
    //    }
    //  else if(condition){
    //     Block of code to be executed;
    //   }
     //  else if(condition){
    //     Block of code to be executed;
    //   }
     //  else {
    //     Block of code to be executed;
    //   }

     int marks=80;
     if(marks>=95){
        System.out.println("Grade A");
     }
     else if(marks>=75){
          System.out.println("Grade B");
     }
     else if(marks>=60){
        System.out.println("Grade C");
     }
     else {
          System.out.println("Fail");
     }

     //nested if :syntax
     // if(condition){
    //   if(condition){
    //   Block of code to be executed
    //    }
    //  else{
    //     Block of code to be executed;
    //   }
    //  else{
    //     Block of code to be executed;
    //   }
    //}

     int num=8;
     if(num>0){
        if(num%2==0){
            System.out.println("positive and even number");
        }
        else{
            System.out.println("positive but odd");
        }
    }
        else{
            System.out.println("negative number");
        }

       

}   
       }

    

