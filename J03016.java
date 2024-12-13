import java.util.*;
public class J03016 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            long re1=0;
            long re2=0;
            for(int i=0;i<s.length();i+=2){
                int tmp=s.charAt(i)-48;
                re1+=tmp;
            }
            for(int i=1;i<s.length();i+=2){
                int tmp=s.charAt(i)-48;
                re2+=tmp;
            }
            if(Math.abs(re1-re2)%11==0) System.out.println("1");
            else System.out.println("0");
        }
    }
}