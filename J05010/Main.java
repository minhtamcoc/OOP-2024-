import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<MatHang> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name=sc.nextLine();
            String nhom=sc.nextLine();
            double giamua=sc.nextDouble();
            double giaban=sc.nextDouble();
            sc.nextLine();
            list.add(new MatHang(name,nhom,giamua,giaban));
        }
        list.sort(new Comparator<MatHang>() {
            public int compare(MatHang x,MatHang y){
                return Double.compare(y.getProfit(),x.getProfit());
            }
        });
        for(MatHang x:list){
            System.out.println(x);
        }
    }
}