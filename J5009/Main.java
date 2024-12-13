import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<SinhVien> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name=sc.nextLine();
            String age=sc.nextLine();
            double m1=sc.nextDouble();
            double m2=sc.nextDouble();
            double m3=sc.nextDouble();
            sc.nextLine();
            list.add(new SinhVien(name,age,m1,m2,m3));
        }
        list.sort(new Comparator<SinhVien>() {
            public int compare(SinhVien x,SinhVien y){
                if(x.getTong()==y.getTong()) return x.getId().compareTo(y.getId());
                return Double.compare(y.getTong(),x.getTong());
            
            }
        });
        double ans=list.get(0).getTong();
        System.out.println(list.get(0));
        for(int i=1;i<list.size();i++){
            if(list.get(i).getTong()==ans){
                System.out.println(list.get(i));
            }
        }
    }
}