import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s1=sc.next();
            String s2=sc.next();
            int x1=s1.charAt(0)-96;
            int y1=Integer.parseInt(s1.substring(1));
            int x2=s2.charAt(0)-96;
            int y2=Integer.parseInt(s2.substring(1));
            Pair start=new Pair(x1,y1,0);
            Queue<Pair> q=new LinkedList<>();
            q.add(start);
            int[] dx={1,1,-1,-1,-2,-2,2,2};
            int[] dy={-2,2,-2,2,1,-1,-1,1};
            boolean[][] check=new boolean[10][10];
            check[x1][y1]=true;
            while(!q.isEmpty()){
                Pair tmp=q.peek();
                q.poll();
                int i=tmp.getX();
                int j=tmp.getY();
                int dem=tmp.getCNT();
                if(i==x2&&j==y2){
                    System.out.println(dem);
                    break;
                }
                for(int k=0;k<8;k++){
                    int i1=i+dx[k];
                    int j1=j+dy[k];
                    if(i1>=1&&i1<=8&&j1>=1&&j1<=8&&!check[i1][j1]){
                        Pair res=new Pair(i1,j1,dem+1);
                        q.add(res);
                        check[i1][j1]=true;
                    }
                }
            }
        }
    }
}
// 8
// e2 e4
// a1 b2
// b2 c3
// a1 h8
// a1 h7
// h8 a1
// b1 c3
// f6 f6