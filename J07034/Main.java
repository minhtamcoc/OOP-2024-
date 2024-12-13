package J07034;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        File f=new File("DC.in");
        try{
        Scanner sc=new Scanner(f);
        List<Mon_Hoc> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String code=sc.nextLine();
            String name=sc.nextLine();
            int ad=Integer.parseInt(sc.nextLine());
            list.add(new Mon_Hoc(code, name, ad));
        }
        list.sort(new Comparator<Mon_Hoc>() {
                @Override
                public int compare(Mon_Hoc x, Mon_Hoc y) {
                    return x.getName().compareTo(y.getName());
                }
            });
       for(Mon_Hoc x:list){
        System.out.println(x);
       }
    } catch(FileNotFoundException e){
        System.out.println(e);
    }
    }
}
