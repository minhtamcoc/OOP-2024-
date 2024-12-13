/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j07047;

import java.io.FileNotFoundException;
import java.io.*;
import java.lang.reflect.Array;
import java.text.ParseException;
import  java.util.*;
/**
 *
 * @author admin
 */
public class J07047{
    public static void main(String[] args)throws FileNotFoundException,ParseException{
        File f=new File("DATA.in");
        Scanner sc=new Scanner(f);
        int t=Integer.parseInt(sc.nextLine());
        List<Phong> list1=new ArrayList<>();
        while(t-->0){
            String[] ss=sc.nextLine().split("\\s+");
            String id=ss[0];
            String name=ss[1];
            int dongia=Integer.parseInt(ss[2]);
            double phiphucvu=Double.parseDouble(ss[3]);
            list1.add(new Phong(id, name, dongia, phiphucvu));
        }
        t=Integer.parseInt(sc.nextLine());
        List<KhachHang> list2=new ArrayList<>();
        while(t-->0){
            String name=sc.nextLine();
            String idP=sc.nextLine();
            String ngayden=sc.nextLine();
            String ngaydi=sc.nextLine();
            list2.add(new KhachHang(name, idP, ngayden, ngaydi));
        }
        for(KhachHang xHang:list2){
            for(Phong yPhong:list1){
                if(xHang.getIDP().substring(2,3).equals(yPhong.getId())){
                    xHang.setPhong(yPhong);
                }
            }
        }
        list2.sort(new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                return Integer.compare(o2.getO(),o1.getO());
            }
        });
        for(KhachHang xHang:list2){
            System.out.println(xHang);
        }
    }
}
