import java.util.*;
public class J02004 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
        int n=sc.nextInt();
        sc.nextLine();
        StringBuilder ans=new StringBuilder();
        for(int i=1;i<=n;i++){
            String tmp=sc.next();
            ans.append(tmp);
        }
        String x=ans.toString();
        String y=ans.reverse().toString();
        if(x.equals(y)){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
}
