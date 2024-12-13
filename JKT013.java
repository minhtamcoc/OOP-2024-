import java.util.*;
public class JKT013 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> list=new ArrayList<>();
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Queue<String> q=new LinkedList<>();
            q.add("6");
            q.add("8");
            while(!q.isEmpty()){
                String k=q.peek();
                list.add(k);
                q.poll();
                String tmp1=k+"6";
                String tmp2=k+"8";
                if(tmp1.length()<=n) q.add(tmp1);
                if(tmp2.length()<=n) q.add(tmp2);
            }
            System.out.println(list.size());
            for(int i=list.size()-1;i>=0;i--){
                System.out.print(list.get(i)+" ");
            }
            list.clear();
            System.out.println();
        }   
    }
}
