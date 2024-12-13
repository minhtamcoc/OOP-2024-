/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j07047;

/**
 *
 * @author admin
 */
public class Phong {
  private String id;
  private String name;
  private int dongia;
  private double phiphucvu;

    public Phong(String id, String name, int dongia, double phiphucvu) {
        this.id = id;
        this.name = name;
        this.dongia = dongia;
        this.phiphucvu = phiphucvu;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDongia() {
        return dongia;
    }

    public double getPhiphucvu() {
        return phiphucvu;
    }
  
}
