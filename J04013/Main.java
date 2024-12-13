import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String id=sc.nextLine();
        String name=sc.nextLine();
        double toan=sc.nextDouble();
        double ly=sc.nextDouble();
        double hoa=sc.nextDouble();
        ThiSinh x=new ThiSinh(id,name,toan,ly,hoa);
        System.out.println(x);
    }
}
// KV2A002
// Hoang Thanh Tuan
// 5
// 6
// 5
// KV2B123
// Ly Thi Thu Ha
// 8
// 6.5
// 7