import java.util.*;
public class J02028 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
           long n=sc.nextLong();
            long k=sc.nextLong();
            long[] a=new long[(int)n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            long re=0;
            boolean check=false;
            Set<Long> st=new HashSet<>();
            st.add(0L);
            for(int i=0;i<n;i++){
                re+=a[i];
                if(st.contains(re-k)){
                    check=true;
                    break;
                }
                st.add(re);
            }
            if(check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}