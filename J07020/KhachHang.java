public class KhachHang {
    static int idx=0;
    private String idKH;
    private String nameKH;
    private String gioitinh;
    private String age;
    private String addr;
    public KhachHang(String nameKH,String gioitinh,String age,String addr){
        idx++;
        this.idKH="KH"+String.format("%03d",idx);
        this.nameKH=nameKH;
        this.gioitinh=gioitinh;
        this.age=age;
        this.addr=addr;
    }
    public String getIDKH(){
        return idKH;
    }
    public String getNameKH(){
        return nameKH;
    }
    public String getADDR(){
        return addr;
    }
}
