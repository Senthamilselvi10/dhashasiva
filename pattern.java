public class pattern {
    public static void main(String[] args) {
        int a = 5; 
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k<= i; k++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j <a; j++) {
                System.out.print("* ");
            }
            System.out.println();
            a--;
        }

        
        for (int i = 1; i < 5; i++) {
            for (int k = 5; k >i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
