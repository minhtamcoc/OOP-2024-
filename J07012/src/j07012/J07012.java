/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j07012;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import  java.util.*;
import  java.io.*;
/**
 *
 * @author admin
 */
public class J07012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException,ClassNotFoundException{
        // TODO code application logic here
        ObjectInputStream o=new ObjectInputStream(new FileInputStream("DATA.in"));
        List<String> list= (ArrayList<String>) o.readObject();
        o.close();
        TreeMap<String,Integer> mpMap=new TreeMap<>();
        for(String x:list){
            String[] ss=x.toLowerCase().split("\\W\\s*");
            for(String y:ss){
                if(!y.isEmpty()){
                    if(mpMap.containsKey(y)) mpMap.put(y,mpMap.get(y)+1);
                     else mpMap.put(y,1);
                }
            }
        }
        List<Pair> list1=new ArrayList<>();
        for(String xString:mpMap.keySet()){
            list1.add(new Pair(xString,mpMap.get(xString)));
        }
        list1.sort(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
              if(o1.getY()!=o2.getY()) return Integer.compare(o2.getY(),o1.getY());
              return o1.getX().compareTo(o2.getX());
            }
        });
        for(Pair xPair:list1){
            System.out.println(xPair);
        }
    }
    
}
