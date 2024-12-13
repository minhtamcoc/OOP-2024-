import java.util.*;
public class J03006 {
    public static int check1(String s){
        StringBuilder ss=new StringBuilder(s);
        if(ss.reverse().toString().equals(s)) return 1;
        return 0;
    }
    public static int check2(String s){
        for(int i=0;i<s.length();i++){
            int tmp=s.charAt(i)-48;
            if(tmp%2!=0) return 0;
        }
        return 1;
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
