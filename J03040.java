import java.util.*;
public class J03040 {
    public static boolean check1(String s){
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)>=s.charAt(i+1)) return false;
        }
        return true;
    }
    public static boolean check2(String s){
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)) return false;
        }
        return true;
    }
    public static boolean check3(String s){
        String re1=s.substring(0,3);
        String re2=s.substring(3);
        for(int i=0;i<re1.length()-1;i++){
            if(re1.charAt(i)!=re1.charAt(i+1)) return false;
        }
        for(int i=0;i<re2.length()-1;i++){
            if(re2.charAt(i)!=re2.charAt(i+1)) return false;
        }
        return true;
    }
    public static boolean check4(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='6'&&s.charAt(i)!='8') return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            String re=s.substring(5);
            String tmp="";
            String[] ss=re.split("\\.");
            for(String x:ss){
                tmp+=x;
            }
            if(check1(tmp)||check2(tmp)||check3(tmp)||check4(tmp)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
// 7
// 29T1–123.45
// 29T1–555.55
// 29T1–222.33
// 29T1–686.88
// 29T1–123.33
// 29T1–555.54
// 29T1–606.88