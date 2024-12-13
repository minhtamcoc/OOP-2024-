public class MatHang {
    static int idx=0;
    private String id;
    private String name;
    private String nhom;
    private double giamua;
    private double giaban;
    private double profit;
    public MatHang(String name,String nhom,double giamua,double giaban){
        idx++;
        this.id=String.format("%d",idx);
        this.name=name;
        this.nhom=nhom;
        this.giamua=giamua;
        this.giaban=giaban;
        this.profit=this.giaban-this.giamua;
    }
    public double getProfit(){
        return profit;
    }
    public String toString(){
        return id+" "+name+" "+nhom+" "+String.format("%.2f",profit);
    }
}
