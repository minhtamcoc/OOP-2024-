import java.util.*;
public class J01024 {
    public static int check(String s){
        for(int i=0;i<s.length();i++){
            int tmp=s.charAt(i)-'0';
            if(tmp>=3) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            String s=sc.nextLine();
            if(check(s)==1) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
