/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
import java.util.*;
public class J01001 {
    public static void main(String[] args) {
        int n,m;
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            m=sc.nextInt();
            if(n<=0||m<=0){
                System.out.println("0");
            }
            else{
            System.out.println(2*(m+n)+" "+m*n);
            }
    }
}
