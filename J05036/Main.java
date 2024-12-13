import java.util.*;
public class Main {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    List<Hang> list=new ArrayList<>();
    int t=sc.nextInt();
    sc.nextLine();
    while(t-->0){
        String name=sc.nextLine();
        String donvi=sc.nextLine();
        double gianhap=sc.nextDouble();
        double sl=sc.nextDouble();
        sc.nextLine();
        list.add(new Hang(name,donvi,gianhap,sl));
    }
     for(Hang x:list){
        System.out.println(x);
     }
 }
}
// 4
// DUONG
// KG
// 7500
// 150
// TRUNG
// CHUC
// 10000
// 225
// GAO
// KG
// 14000
// 118
// SUA
// HOP
// 48000
// 430