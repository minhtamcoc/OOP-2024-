public class Pair {
    private HinhVuong x;
    private int cnt;
    public Pair(HinhVuong x,int cnt){
        this.x=x;
        this.cnt=cnt;
    }
    public int getCnt(){
        return cnt;
    }
    public HinhVuong getHV(){
        return x;
    }
}
