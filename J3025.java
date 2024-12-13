import java.util.*;
public class J3025 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            int l=0;
            int r=s.length()-1;
            int cnt=0;
            while(l<r){
                if(s.charAt(l)!=s.charAt(r)) cnt++;
                l++;
                r--;
            }
            if(cnt==1||(cnt==0&&s.length()%2==1)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
