package Assignment;

public class Reverse {
    public static void main(String[] args) {
        
        String str = "234";
        String  reversed = "";
        for(int i =str.length()-1;i>=0;i--){
            reversed = reversed +str.charAt(i);
        }
        System.out.println(reversed);
    }
    
}
