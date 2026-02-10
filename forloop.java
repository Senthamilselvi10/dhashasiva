 class forloop {
    public static void main(String[] args) {
        //Print numbers from 1 to 10
        for( int i=1;i<=10;i++){
              System.out.println(i);
        }
       
    //Print multiplication table of 5
    int num=5;
    for(int i=1;i<=10;i++){
        System.out.println(num+"x"+i+"="+(num*i));
    }
    
    //Find sum of first 10 natural numbers
    int sum = 0;

for(int i = 1; i <= 10; i++){
    sum = sum + i;
}

System.out.println("Sum = " + sum);
      //Print numbers from 10 to 1 (reverse)

    for(int i=10;i>=1;i--){
        System.out.println(i);
    }
    //Count even numbers between 1 and 50
    int count = 0;

for(int i = 1; i <= 50; i++){
    if(i % 2 == 0){
        count++;
    }
}

System.out.println("Total even numbers = " + count);

//Print square of numbers from 1 to 10
for(int i = 1; i <= 10; i++){
    System.out.println(i*i);
}

    




    }
    
    
}
