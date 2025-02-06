import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entet value");
        int n = sc.nextInt();
        for(int i = n;i <=25;i++){

            int div = 2;
            boolean isprime = true;
            while(div<=i/2){
               if(i%div ==0){
                isprime=false;
                break;
               }
               div++;

                    
        
            }
            System.out.println(isprime?i+" ":" ");

        }
        
    }
    
}
