import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<HocSinh> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name=sc.nextLine();
            double GPA=sc.nextDouble();
            sc.nextLine();
            list.add(new HocSinh(name,GPA));
        }
        list.sort(new Comparator<HocSinh>() {
            public int compare(HocSinh x,HocSinh y){
                return Double.compare(y.getGPA(),x.getGPA());
            }
        });
        list.get(0).setXH(1);
        for(int i=1;i<list.size();i++){
            if(list.get(i).getGPA()==list.get(i-1).getGPA()){
                list.get(i).setXH(list.get(i-1).getXH());
            }
            else list.get(i).setXH(i+1);
        }
        list.sort(new Comparator<HocSinh>() {
            public int compare(HocSinh x,HocSinh y){
                return x.getId().compareTo(y.getId());
            }
        });
        for(HocSinh x:list){
            System.out.println(x);
        }
    }
}