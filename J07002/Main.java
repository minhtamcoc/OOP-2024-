import java.util.*;
import java.io.*;
import java.text.ParseException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File f=new File("DATA.in");
        Scanner sc=new Scanner(f);
        long tong=0;
        while(sc.hasNext()){
            if(sc.hasNextInt()){
                int tmp=sc.nextInt();
                tong+=tmp;
            }
            else sc.next();
        }
        System.out.println(tong);
        sc.close();
    }
}