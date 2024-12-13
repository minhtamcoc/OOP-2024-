public class DanhSach extends Hang {
    private int slnhap;
    private int dongianhap;
    private int soluongxuat;
    private int TN;
    private int TX;
    public DanhSach(String id,String name,String xeploai,int slnhap,int dongianhap,int soluongxuat){
        super(id,name,xeploai);
        this.slnhap=slnhap;
        this.soluongxuat=soluongxuat;
        this.dongianhap=dongianhap;
        this.TN=this.dongianhap*this.slnhap;
        int tmp=this.soluongxuat*this.dongianhap;
        if(getXL().equals("A")){
            this.TX=(int)(tmp*0.08)+tmp;
        }
        else if(getXL().equals("B")){
            this.TX=(int)(tmp*0.05)+tmp;
        }
        else if(getXL().equals("C")){
            this.TX=(int)(tmp*0.02)+tmp;
        }
    }
    public String toString(){
        return getId()+" "+getName()+" "+TN+" "+TX;
    }
}
