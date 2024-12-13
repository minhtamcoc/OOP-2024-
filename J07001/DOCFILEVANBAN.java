import java.util.*;
import java.io.*;
public class DOCFILEVANBAN {
    public static void main(String[] args) {
        File f=new File("DATA.in");
        try{
           Scanner sc=new Scanner(f);
           while(sc.hasNextLine()){
               String line=sc.nextLine();
               System.out.println(line);
           }
           sc.close();
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
}
