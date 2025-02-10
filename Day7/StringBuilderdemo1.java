package Day7;

public class StringBuilderdemo1 {
   public static void main(String[] args) {
    String s1 = "hello";
    StringBuilder sb = new StringBuilder(s1);
    sb.append(" world");
    System.out.println(sb);

    StringBuilder sb2 = new StringBuilder("cat");
    sb2.reverse();
    System.out.println(sb2);
    
   }
    
}
