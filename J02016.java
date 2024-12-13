import java.util.*;
public class J02016 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
           Long[] a=new Long[n+1];
            for(int i=0;i<n;i++){
                long x=sc.nextInt();
                a[i]=x*x;
            }
            Arrays.sort(a,0,n,Comparator.naturalOrder());
            boolean check=false;
            for(int k=n-1;k>=2;k--){
                int i=0;
                int j=k-1;
                while(i<j){
                    if(a[i]+a[j]==a[k]){
                        check=true;
                        System.out.println("YES");
                        break;
                    }
                    else if(a[i]+a[j]>a[k]){
                        j--;
                    }
                    else i++;
                }
                if(check) break;
            }
            if(!check){
                System.out.println("NO");
            }
        }
    }
}
