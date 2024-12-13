import java.util.*;
import java.io.*;
public class LOAIBOSONGUYEN {
    public static void main(String[] args) {
        File f=new File("DATA.in");
        List<String> list=new ArrayList<>();
        try {
            Scanner sc=new Scanner(f);
            while(sc.hasNext()){
                if(sc.hasNextInt()){
                    sc.nextInt();
                }
                else {
                   list.add(sc.next());
                }
            }
            list.sort(new Comparator<String>() {
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            });
            for(String x:list){
                System.out.print(x+" ");
            }
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
}
