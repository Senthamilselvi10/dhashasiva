 class decisionmaking {
    public static void main(String[] args) {
        //Check if a number is positive
           int x=7;
           if(x>0){
            System.out.println("the number is positive");
           }
   
   //“Divisible by 5” if the number is divisible by 5.

   int num=25;
   if(num%5==0){
    System.out.println(" the number is divisible by 5");
   }

   //A person is eligible to vote if age ≥ 18

   int age=21;
   if (age>=18){
        System.out.println("Eligible to vote");
   }
   
   //Check whether a number is greater than 100 or not

   int a=21;
   if(a>100){
        System.out.println("the number is greater than 100");
   }
   else{
        System.out.println("the number is not greater than 100");
   }

   //Check whether a year is a leap year or not

   int leap=2026;
   if(leap%4==0){
        System.out.println("given number is a leap year");
   }
   else{
        System.out.println("the given number i not a leap year");
   }

   //Check whether a character is a vowel or consonant
   char ch='n';
   if(ch=='a'||ch=='e'||ch=='i'|| ch=='o'||ch=='u'){
        System.out.println("character is a vowel");
   }
   else{
        System.out.println("character is consonant");
   }

   //Check whether a number is single-digit or not
   int digit=11;
   if(digit>=0&&digit<=9){
        System.out.println("number is single digit");
   }
   else{
        System.out.println("number is not single digit");
   }
   

   //Check whether a number is positive, negative, or zero

   int n=10;
   if(n>0){
        System.out.println("number is positive");
   }
   else if (n<0){
        System.out.println("number is negstive");

   }
   else{
        System.out.println("number is zero");

   }
   
   
   
   
   
        }



    
}
