/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j07012;

/**
 *
 * @author admin
 */
public class Pair {
    private String x;
    private int y;

    public Pair(String x,int y) {
        this.x = x;
        this.y = y;
    }

    public String getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public String toString(){
        return x+" "+y;
    }
}
