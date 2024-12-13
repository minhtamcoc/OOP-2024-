import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Diem> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            String lop=sc.nextLine();
            double m1=sc.nextDouble();
            double m2=sc.nextDouble();
            double m3=sc.nextDouble();
            sc.nextLine();
            list.add(new Diem(id,name,lop,m1,m2,m3));
        }
        list.sort(new Comparator<Diem>() {
            public int compare(Diem x,Diem y){
                return x.getName().compareTo(y.getName());
            }
        });
        int idx=0;
        for(Diem x:list){
            idx++;
            System.out.print(idx+" ");
            System.out.println(x);
        }
    }
}
// 3
// B20DCCN999
// Nguyen Van Nam
// D20CQCN04-B
// 10.0
// 9.0
// 8.0
// B20DCAT001
// Le Van An
// D20CQAT02-B
// 6.0
// 6.0
// 4.0
// B20DCCN111
// Nguyen Van Binh
// D20CQCN01-B
// 9.0
// 5.0
// 6.0