import java.util.*;
public class J03024{
    public static int check(String s){
        for(int i=0;i<s.length();i++){
            char tmp=s.charAt(i);
            if(!Character.isDigit(tmp)) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            if(check(s)==0){
                System.out.println("INVALID");
            }
            else{
                int re1=0;
                int re2=0;
                for(int i=0;i<s.length();i++){
                    int tmp=s.charAt(i)-48;
                    if(tmp%2==0) re2++;
                    else re1++;
                }
                if(s.length()%2==0&&(re2>re1)) System.out.println("YES");
                else if(s.length()%2==1&&(re1>re2)) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
