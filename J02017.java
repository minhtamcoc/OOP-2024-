import java.util.*;
public class J02017 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n+1];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       Stack<Integer> st=new Stack<>();
       st.push(a[0]);
       for(int i=1;i<n;i++){
        if(!st.isEmpty()&&(st.peek()+a[i])%2==0){
            st.pop();
        }
        else st.push(a[i]);
       }
       System.out.println(st.size());
    }
}
