import java.util.*;
import java.io.*;
public class ChuanHoaHoTen {
    public static String chuanhoa(String s){
        String[] ar=s.split("\\s+");
        StringBuilder builder=new StringBuilder();
        for(String x:ar){
            char tmp=Character.toUpperCase(x.charAt(0));
            builder.append(tmp).append(x.substring(1)).append(" ");
        }
        return builder.toString().trim();
    }
    public static void main(String[] args) {
        File f=new File("DATA.in");
        try{
            Scanner sc=new Scanner(f);
            while(sc.hasNextLine()){
                String line=sc.nextLine().toLowerCase().trim();
                if(line.equals("end")) break;
                line=chuanhoa(line);
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
}
