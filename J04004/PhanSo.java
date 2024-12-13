public class PhanSo {
    private long tu;
    private long mau;
    private long GCD(long a,long b){
        if(b==0) return a;
        return GCD(b,a%b);
    }
    public PhanSo(long tu,long mau){
        long tmp=GCD(tu,mau);
        this.tu=tu/tmp;
        this.mau=mau/tmp;
    }
    public long getTu(){
        return tu;
    }
    public long getMau(){
        return mau;
    }
    public PhanSo Tong(PhanSo y){
        long tmp=(mau*y.getMau())/(GCD(mau,y.getMau()));
        long re=tu*(tmp/mau)+y.getTu()*(tmp/y.getMau());
        PhanSo x=new PhanSo(re,tmp);
        return x;
    }
    public String toString(){
       return tu+"/"+mau;
    }
}
