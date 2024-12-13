import java.security.PublicKey;

public class PhanSo {
    private long tu;
    private long mau;
    private long GCD(long a,long b){
        if(b==0) return a;
        return GCD(b,a%b);
    }
    public PhanSo(long tu,long mau){
        long tmp=GCD(Math.abs(tu),Math.abs(mau));
        if(mau<0&&tu>0){
            this.tu=(0-tu)/tmp;
            this.mau=Math.abs(mau)/tmp;
        }
        else if(mau<0&&tu<0){
            this.tu=Math.abs(tu)/tmp;
            this.mau=Math.abs(mau)/tmp;
        }
        else{
            this.tu=tu/tmp;
            this.mau=mau/tmp;
        }
    }
    public long getTU(){
        return tu;
    }
    public long getMAU(){
        return mau;
    }
    public PhanSo RES1(PhanSo b){
        long MAU=(mau*b.getMAU())/GCD(mau,b.getMAU());
        long TU=tu*(MAU/mau)+b.getTU()*(MAU/b.getMAU());
        MAU=MAU*MAU;
        TU=TU*TU;
        PhanSo tmp=new PhanSo(TU,MAU);
        return tmp;
    }
    public PhanSo RES2(PhanSo b, PhanSo c){
        long TU= tu*b.getTU()*c.getTU();
        long MAU=mau*b.getMAU()*c.getMAU();
        PhanSo tmp=new PhanSo(TU,MAU);
        return tmp;
    }
    public String toString(){
        return tu+"/"+mau;
    }
}
