package danhsachsinhvien1;
import java.util.*;
import java.io.*;
import java.text.ParseException;
public class danhsachsinhvien1 {
    public static void main(String[] args) throws IOException,ClassNotFoundException,ParseException{
        ObjectInputStream o=new ObjectInputStream(new FileInputStream("SV.in"));
        List<SinhVien> list=(ArrayList<SinhVien>) o.readObject();
        o.close();
        for(SinhVien x:list){
            System.out.println(x);
        }
    }
}
