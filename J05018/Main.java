import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<HocSinh> list=new ArrayList<>();
        while(t-->0){
            String name=sc.nextLine();
            double x1=sc.nextDouble();
            double x2=sc.nextDouble();
            double x3=sc.nextDouble();
            double x4=sc.nextDouble();
            double x5=sc.nextDouble();
            double x6=sc.nextDouble();
            double x7=sc.nextDouble();
            double x8=sc.nextDouble();
            double x9=sc.nextDouble();
            double x10=sc.nextDouble();
            sc.nextLine();
            list.add(new HocSinh(name,x1,x2,x3,x4,x5,x6,x7,x8,x9,x10));
        }
        list.sort(new Comparator<HocSinh>() {
            public int compare(HocSinh x,HocSinh y){
                if(x.getTong()==y.getTong()) return x.getId().compareTo(y.getId());
                return Double.compare(y.getTong(),x.getTong());
            }
        });
        for(HocSinh x:list){
            System.out.println(x);
        }
    }
}