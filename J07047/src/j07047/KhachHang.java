/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j07047;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author admin
 */
public class KhachHang {
    static int idx=0;
    private String id;
    private String name;
    private String IDP;
    private String ngayden;
    private String ngaydi;
    private Phong phong;
    private double giamgia;
    private int ngayo;
    public KhachHang(String name, String IDP, String ngayden, String ngaydi)throws ParseException{
        idx++;
        this.id = "KH"+String.format("%02d",idx);
        this.name = name;
        this.IDP = IDP;
        this.ngayden = ngayden;
        this.ngaydi = ngaydi;
        SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
        long time=f.parse(this.ngaydi).getTime()-f.parse(this.ngayden).getTime();
        this.ngayo=(int)(time/86400000);
        int t=this.ngayo;
        if(t>30) this.giamgia=0.06;
        else if(t>=20) this.giamgia=0.04;
        else if(t>=10) this.giamgia=0.02;
        else this.giamgia=0;
    }

    public static int getIdx() {
        return idx;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIDP() {
        return IDP;
    }

    public String getNgayden() {
        return ngayden;
    }

    public String getNgaydi() {
        return ngaydi;
    }

    public Phong getPhong() {
        return phong;
    }
    public void setPhong(Phong phong){
        this.phong=phong;
    }
    public double getThanhTien(){
        int t=this.ngayo;
        if(this.ngayo==0) t++;
        double tmp=t*phong.getDongia()*(1+phong.getPhiphucvu());
        return tmp-this.giamgia*tmp;
    }
    public int getO(){
        return ngayo;
    }
    public String toString(){
        return id+" "+name+" "+IDP+" "+ngayo+" "+String.format("%.02f",getThanhTien());
    }
}
