public class BaiTap {
    static int idx=0;
    private String idBT;
    private String nameBT;
    public BaiTap(String nameBT){
        idx++;
        this.idBT=String.format("%d",idx);
        this.nameBT=nameBT;
    }
    public String getIDBT(){
        return idBT;
    }
    public String getNameBT(){
        return nameBT;
    }

}
// 5 2
// B17DTCN001
// Nguyen Chi  Linh
// 0987345543
// 1
// B17DTCN011
// Vu Viet Thang
// 0981234567
// 1
// B17DTCN023
// Pham Trong Thang
// 0992123456
// 1
// B17DTCN022
// Nguyen Van  Quyet
// 0977865432
// 2
// B17DTCN031
// Ngo Thanh Vien
// 0912313111
// 2
// Xay dung website ban dien thoai truc tuyen
// Xay dung ung dung quan ly benh nhan Covid-19