import java.util.Arrays;

public class Tosum {
     public static void main(String[] args) {
        int a[]={7,1,5};
        int target =8;
        int res[]=new int[2];
        for(int i = 0;i<a.length;i++){
            for(int j =i+1;j<a.length;j++){
                if(a[i]+a[j]==target){
                    res[0]=i;
                    res[1]=j;
                    break;
                }
            }

        }
        System.out.println(Arrays.toString(res));
     } 
}
