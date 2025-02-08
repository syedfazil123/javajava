//package Day5;

public class Numberpattern {
    public static void main(String[] args) {
        int n =5;
        for(int i = 1;i<n*2;i++){
            int totalcolinrow =i>n?2*n-i:i;
            int spaces = n - totalcolinrow;
            for(int j = 1;j<=spaces;j++){
            
                System.out.print(" ");
            }
            for(int k =totalcolinrow;k>0;k--){
                System.out.print(k);
            }
            for(int l = 2;l<=totalcolinrow;l++){
                System.out.print(l);
            }
            System.out.println();
        }
    }
    
}
