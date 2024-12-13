import java.util.*;
public class J03007 {
    public static int check1(String s){
        if(s.charAt(0)=='8'&&s.charAt(s.length()-1)=='8') return 1;
        return 0;
    }
    public static int check2(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            int tmp=s.charAt(i)-48;
            sum+=tmp;
        }
        if(sum%10==0) return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            if(check1(s)==1&&check2(s)==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
