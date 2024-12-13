import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            HashSet<Integer> st=new HashSet<>();
            Pair x=new Pair(a,0);
            Queue<Pair> q=new LinkedList<>();
            q.add(x);
            st.add(a);
            while(!q.isEmpty()){
                Pair tmp=q.peek();
                q.poll();
                int res=tmp.getX();
                int dem=tmp.getCnt();
                if(res==b){
                    System.out.println(dem);
                    break;
                }
                if(res-1>=0&&!st.contains(res-1)){
                    q.add(new Pair(res-1,dem+1));
                    st.add(res-1);
                }
                if(res*2<=20000&&!st.contains(res*2)){
                    q.add(new Pair(res*2,dem+1));
                    st.add(res*2);
                }
            }
        }
    }
}