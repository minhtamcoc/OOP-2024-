import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<Hang> list=new ArrayList<>();
        while(t-->0){
            String name=sc.nextLine();
            String donvi=sc.nextLine();
            int gm=sc.nextInt();
            int gb=sc.nextInt();
            sc.nextLine();
            list.add(new Hang(name, donvi, gm, gb));
        }
        list.sort(new Comparator<Hang>() {
            public int compare(Hang x,Hang y){
                if(x.getLoinhuan()==y.getLoinhuan()){
                    return x.getId().compareTo(y.getId());
                }
                return Integer.compare(y.getLoinhuan(),x.getLoinhuan());
            }
        });
        for(Hang x:list){
            System.out.println(x);
        }
    }
}