import java.util.*;
public class J01018 {
    public static int check1(String s){
        for(int i=0;i<s.length()-1;i++){
            int tmp=s.charAt(i+1)-s.charAt(i);
            if(Math.abs(tmp)!=2) return 0;
        }
        return 1;
    }
    public static int check2(String s){
        int res=0;
        for(int i=0;i<s.length();i++){
            int tmp=s.charAt(i)-'0';
            res+=tmp;
        }
      if(res%10==0)  return 1;
      return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            String s=sc.nextLine();
            if(check1(s)==1&&check2(s)==1) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
