import java.util.*;
public class J08028 {
    public static long dientich(long[] a,int n){
        int[] l=new int[n];
        int[] r=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&a[i]<=a[st.peek()]){
                st.pop();
            }
            l[i]=(st.isEmpty())?(0):(st.peek()+1);
            st.push(i);
        }
        while(!st.isEmpty()){
            st.pop();
        }
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&a[i]<=a[st.peek()]){
                st.pop();
            }
            r[i]=(st.isEmpty())?(n-1):(st.peek()-1);
            st.push(i);
        }
        long Max=0;
        for(int i=0;i<n;i++){
            long tmp=(r[i]-l[i]+1)*a[i];
           Max=Math.max(Max,tmp);
        }
        return Max;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
         long[] a=new long[n];
        long[] b=new long[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
            b[i]=(long)m-a[i];
        }
        System.out.println(Math.max(dientich(a,n),dientich(b,n)));
    }
}