public class StrinDemo6 {
    public static void main(String[] args) {
        String s = "hello";
        char c[]=s.toCharArray();
        for(int i =0;i<s.length();i++){
            System.out.println(c[i]);
        }
        String s1=new String(c);
        System.out.println(s1);
    }
    
}
