import java.util.*;
public class J08022 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n+1];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int[] b=new int[n+1];
            Stack<Integer> st=new Stack<>();
            for(int i=n-1;i>=0;i--){
                while(!st.isEmpty()&&st.peek()<= a[i]){
                    st.pop();
                }
                if(st.isEmpty()) b[i]=-1;
                else b[i]=st.peek();
                st.push(a[i]); 
            }
            for(int i=0;i<n;i++) System.out.print(b[i]+" ");
            System.out.println();
        }
    }
}
