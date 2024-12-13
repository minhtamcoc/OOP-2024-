import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        List<SinhVien> list1=new ArrayList<>();
        while(t-->0){
            String name=sc.nextLine();
            double GPA=sc.nextDouble();
            long DRL=sc.nextLong();
            sc.nextLine();
            list1.add(new SinhVien(name,GPA,DRL));
        }
            list1.sort(new Comparator<SinhVien>() {
                public int compare(SinhVien x,SinhVien y){
                    return Double.compare(y.getGPA(),x.getGPA());
                }
            });
           int k=m-1;
            while(k<list1.size()&&(list1.get(k+1).getGPA()==list1.get(k).getGPA())){
                k++;
            }
           for(int i=0;i<list1.size();i++){
            if(i<=k) list1.get(i).setST();
            else list1.get(i).setKH();
           }
           list1.sort(new Comparator<SinhVien>() {
                public int compare(SinhVien x,SinhVien y){
                    return x.getId().compareTo(y.getId());
                }
           });
           for(SinhVien x:list1){
            System.out.println(x);
           }
            
    }
}
// 3 2
// Nguyen Van Nam
// 3.59 75
// Tran Hong Ngoc
// 3.61 90
// Do Van An
// 3.22 90