/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
import java.util.*;
import java.io.*;
public class J01006 {
    public static void main(String[] args) {
        long[] F=new long[93];
        F[0]=0;
        F[1]=1;
        for(int i=2;i<=92;i++){
            F[i]=F[i-1]+F[i-2];
        }
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t>0){
            int n;
            n=sc.nextInt();
            System.out.println(F[n]);
            t--;
        }
}
}
