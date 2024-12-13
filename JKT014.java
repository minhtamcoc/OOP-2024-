import java.util.*;;
public class JKT014 {
    // dau tu chung khoan
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
            for(int i=0;i<n;i++){
                while(!st.isEmpty()&&a[st.peek()]<=a[i]){
                    st.pop();
                }
                if(st.isEmpty()) b[i]=-1;
                else b[i]=st.peek();
                st.push(i);
            }
            for(int i=0;i<n;i++) System.out.print((i-b[i])+" ");
            System.out.println();
        }
    }
}
