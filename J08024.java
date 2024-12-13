import java.util.*;
public class J08024 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Queue<String> q=new LinkedList<>();
            q.add("9"); 
            while(!q.isEmpty()){
                String tmp=q.peek();
                q.poll();
                int res=Integer.parseInt(tmp);
                if(res%n==0){
                    System.out.println(res);
                    break;
                }
                q.add(tmp+"0");
                q.add(tmp+"9");
            }
        }
    }
}