import java.util.*;
public class J01010 {
    public static int check(String s){
        for(int i=0;i<s.length();i++){
            char tmp=s.charAt(i);
            if(tmp!='1'&&tmp!='0'&&tmp!='8'&&tmp!='9') return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            if(check(s)==0) System.out.println("INVALID");
            else{
              StringBuilder ss=new StringBuilder(s);
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='8'||s.charAt(i)=='9'){
                    ss.setCharAt(i,'0');
                }
            }
            s=ss.toString();
            char[] arr=s.toCharArray();
            int idx=0;
            while(idx<s.length()&&arr[idx]=='0'){
                idx++;
            }
            if(idx==arr.length){
                System.out.println("INVALID");
            }
            else{
            for(int i=idx;i<s.length();i++){
                System.out.print(arr[i]);
            }
            System.out.println();
        }
            }
        }
    }
}