package Day7;

public class StringBuilderdemo2 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("abcf");
        sb.insert(3,"raa");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        
        sb.replace(5,sb.capacity(),"hello world");
        System.out.println(sb);

    }
    
}
