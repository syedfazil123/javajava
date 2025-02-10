package Day7;

public class Indexof {
    public static void main(String[] args) {
        String s1="hello world";
        System.out.println(s1.indexOf("o"));
        System.out.println(s1.indexOf("o",5));
        System.out.println(s1.lastIndexOf("o"));
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(6,s1.length()-1));
        System.out.println(s1.subSequence(1,10));
    

    }
    
}
