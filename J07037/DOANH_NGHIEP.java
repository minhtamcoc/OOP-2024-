/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07037;

import java.util.Comparator;

/**
 *
 * @author admin
 */
public class DOANH_NGHIEP {
    private String code;
    private String name;
    private int soluong;
    public DOANH_NGHIEP(String code, String name, int soluong) {
        this.code = code;
        this.name = name;
        this.soluong = soluong;
    }
    public String getCode() {
        return code;
    }
    @Override
    public String toString(){
        return code+" "+name+" "+soluong;
    }
}
