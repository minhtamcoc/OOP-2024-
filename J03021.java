import java.util.*;
public class J03021 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine().toUpperCase();
            StringBuilder ss=new StringBuilder();
            for(int i=0;i<s.length();i++){
                char tmp=s.charAt(i);
                if(tmp>='A'&&tmp<='C') ss.append("2");
                else if(tmp>='D'&&tmp<='F') ss.append("3");
                else if(tmp>='G'&&tmp<='I') ss.append("4");
                else if(tmp>='J'&&tmp<='L') ss.append("5");
                else if(tmp>='M'&&tmp<='O') ss.append("6");
                else if(tmp>='P'&&tmp<='S') ss.append("7");
                else if(tmp>='T'&&tmp<='V') ss.append("8");
                else if(tmp>='W'&&tmp<='Z') ss.append("9");
            }
            String re1=ss.toString();
            String re2=ss.reverse().toString();
            if(re1.equals(re2)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
