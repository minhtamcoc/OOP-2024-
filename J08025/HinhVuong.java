import java.util.*;
public class HinhVuong {
    private int a,b,c,d,e,f;
    public HinhVuong(int a,int b,int c,int d,int e,int f){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public int getC(){
        return c;
    }
    public int getD(){
        return d;
    }
    public int getE(){
        return e;
    }
    public int getF(){
        return f;
    }
    public HinhVuong Left(){
        HinhVuong k=new HinhVuong(d,a,c,e,b,f);
        return k;
    }
    public HinhVuong Right(){
        HinhVuong k=new HinhVuong(a,e,b,d,f,c);
        return k;
    }
    public boolean isTRUE(HinhVuong x){
        if(a==x.getA()&&b==x.getB()&&c==x.getC()&&d==x.getD()&&e==x.getE()&&f==x.getF()) return true;
        return false;
    }
    
}
