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
        int q=sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String s=sc.nextLine();
            String[] tmp=s.split(" ");
            StringBuilder ss=new StringBuilder();
            for(String x:tmp){
                char k=Character.toUpperCase(x.charAt(0));
                ss.append(k);
            }
            String ma=ss.toString();
            System.out.print("DANH SACH GIANG VIEN BO MON ");
            System.out.println(ma+":");
            for(GiangVien x:list){
                if(ma.equals(x.getIDN())){
                    System.out.println(x);
                }
            }
        }
    }
}