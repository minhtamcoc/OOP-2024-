import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Tien> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String SD=sc.nextLine();
            long chisocu=sc.nextLong();
            long chisomoi=sc.nextLong();
            sc.nextLine();
            list.add(new Tien(SD,chisocu,chisomoi));
        }
        for(Tien x:list){
            System.out.println(x);
        }
    }
}
// 3
// KD
// 400
// 555
// NN
// 58
// 400
// CN
// 150
// 700