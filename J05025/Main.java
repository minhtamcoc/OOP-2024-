import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<GiangVien> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name=sc.nextLine();
            String nganh=sc.nextLine();
            list.add(new GiangVien(name,nganh));
        }
        list.sort(new Comparator<GiangVien>() {
            public int compare(GiangVien x,GiangVien y){
                if(x.getTen().equals(y.getTen())) return x.getId().compareTo(y.getId());
                return x.getTen().compareTo(y.getTen());
            }
        });
        for(GiangVien x:list){
            System.out.println(x);
        }
    }
}