import java.util.*;
public class J02356 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        if(s==0&&n!=1){
            System.out.println("-1 -1");
        }
        else if((9*n)<s){
            System.out.println("-1 -1");
        }
        else if(n==1&&s==0){
            System.out.println("0 0");
        }
        else{
            int[] a=new int[n];
            int idx=n;
            int re=s;
            while(idx>0){
                idx--;
                for(int i=9;i>=0;i--){
                    if(re>=i){
                        a[idx]=i;
                        re-=i;
                        break;
                    }
                }
            }
            int re1=0;
            while(a[re1]==0){
                re1++;
            }
            if(a[0]==0){
                a[0]=1;
                a[re1]--;
            }
            for(int i=0;i<n;i++){
                System.out.print(a[i]);
            }
            System.out.print(" ");
            int k=n;
            int[] b=new int[n];
            while(k-->0){
                for(int i=9;i>=0;i--){
                    if(s>=i){
                        b[idx]=i;
                        idx++;
                        s-=i;
                        break;
                    }
                }
            }
            for(int i=0;i<n;i++){
                System.out.print(b[i]);
            }
        }

    }
}