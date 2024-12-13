import java.util.*;
public class J02027 {
    public static int Lower_Bound(int left,int right,int key,Integer[] a){
        int l=left;
        int r=right-1;
       while(l<=r){
        int mid=(l+r)/2;
        if(a[mid]<key){
            l=mid+1;
        }
        else r=mid-1;
       }
       return l;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            Integer[] a=new Integer[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a,0,n,Comparator.naturalOrder());
            long cnt=0;
            for(int i=0;i<n;i++){
                int j=Lower_Bound(i+1,n,k+a[i],a);
                cnt+=j-i-1;
            }
            System.out.println(cnt);
        }
    }
}