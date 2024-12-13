import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        File f=new File("MATHANG.in");
        try{
            Scanner sc=new Scanner(f);
            List<Hang> list=new ArrayList<>();
            int t=Integer.parseInt(sc.nextLine());
            while(t-->0){
                String name=sc.nextLine();
                String nhomhang=sc.nextLine();
                double giamua=Double.parseDouble(sc.nextLine());
                double giaban=Double.parseDouble(sc.nextLine());
                list.add(new Hang(name,nhomhang,giamua,giaban));
            }
            list.sort(new Comparator<Hang>() {
                public int compare(Hang o1, Hang o2) {
                    return Double.compare(o2.getLoinhuan(),o1.getLoinhuan());
                }
            });
            for(Hang hang:list){
                System.out.println(hang);
            }
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
}
