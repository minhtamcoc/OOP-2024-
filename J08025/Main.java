import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a,b,c,d,e,f;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            d=sc.nextInt();
            e=sc.nextInt();
            f=sc.nextInt();
            HinhVuong x=new HinhVuong(a,b,c,d,e,f);
           int a2=sc.nextInt();
           int b2=sc.nextInt();
            int c2=sc.nextInt();
            int d2=sc.nextInt();
            int e2=sc.nextInt();
            int f2=sc.nextInt();
            HinhVuong y=new HinhVuong(a2,b2,c2,d2,e2,f2);
            Pair pair=new Pair(x,0);
            Queue<Pair> q=new LinkedList<>();
            q.add(pair);
            while(!q.isEmpty()){
                Pair tmp=q.peek();
                q.poll();
                HinhVuong res=tmp.getHV();
                int dem=tmp.getCnt();
                if(res.isTRUE(y)){
                    System.out.println(dem);
                    break;
                }
                // QUAY TRAI
                HinhVuong re1=res.Left();
                Pair tmp1=new Pair(re1,dem+1);
                q.add(tmp1);
                // QUAY PHAI
                HinhVuong re2=res.Right();
                Pair tmp2=new Pair(re2,dem+1);
                q.add(tmp2);
            }
        }
    }
}