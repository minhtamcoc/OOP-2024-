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
    public String toString(){
        return tu+"/"+mau;
    }
}
