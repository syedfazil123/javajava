public class Array1 {
    public static void main(String[] args) {
        int a[]={4,8,3,6,1};
        int first = Integer.MAX_VALUE;// max = MAX_VALUE;
        int second = Integer.MAX_VALUE;//max =  MAX_VALUE;
        int third = Integer.MAX_VALUE;// MAX =MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(first>a[i]){//>
                third = second;
                second = first;
                first = a[i];
            }
            else if (second>a[i]){//>
                third =second;
                second = a[i];
            }
            else if(third>a[i]){
                third = a[i];
            }
        }
       System.out.println(first+" "+second+" "+third);

    }
}
