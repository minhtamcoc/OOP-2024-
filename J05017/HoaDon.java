public class HoaDon {
    static int idx=0;
    private String id;
    private String name;
    private long socu;
    private long somoi;
    private long tong;
    public HoaDon(String name,long socu,long somoi){
        idx++;
        this.id="KH"+String.format("%02d",idx);
        this.name=name;
        this.socu=socu;
        this.somoi=somoi;
        long tieuthu=this.somoi-this.socu;
        long dongia=0;
        double phuphi=0;
        long ans=0;
        if(tieuthu>100){
            phuphi=0.05;
        }
        else if(tieuthu>=51){
            phuphi=0.03;
        }
        else{
            phuphi=0.02;
        }
        if(tieuthu>100){
            ans+=200*(tieuthu-100);
            tieuthu=100;
        }
        if(tieuthu>50){
            ans+=150*(tieuthu-50);
            tieuthu=50;
        }
        if(tieuthu>0){
            ans+=100*(tieuthu);
        }
        this.tong=Math.round((double)(ans*(1+phuphi)));
    }
    public long getT(){
        return tong;
    }
    public String toString(){
        return id+" "+name+" "+tong;
    }
}
