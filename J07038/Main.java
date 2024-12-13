import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File f1=new File("SINHVIEN.in");
        Scanner sc1=new Scanner(f1);
        List<SinhVien> list1=new ArrayList<>();
        int t=Integer.parseInt(sc1.nextLine());
        while(t-->0){
            String id=sc1.nextLine();
            String name=sc1.nextLine().toLowerCase().trim();
            String lop=sc1.nextLine();
            String mail=sc1.nextLine();
            list1.add(new SinhVien(id,name,lop,mail));
        }
        File f2=new File("DN.in");
        Scanner sc2=new Scanner(f2);
        Map<String,DN> mp1=new HashMap<>();
        int q=Integer.parseInt(sc2.nextLine());
        while(q-->0){
            String idN=sc2.nextLine();
            String name=sc2.nextLine();
            long soluong=Long.parseLong(sc2.nextLine());
            mp1.put(idN,new DN(idN,name,soluong));
        }
        File f3=new File("THUCTAP.in");
        Scanner sc3=new Scanner(f3);
        Map<String,List<SinhVien>> mp2=new HashMap();
        int n=Integer.parseInt(sc3.nextLine());
        while(n-->0){
            String s=sc3.nextLine();
            String[] ss=s.split(" ");
            String studentID=ss[0];
            String compannyID=ss[1];
            for(SinhVien x:list1){
                if(x.getId().equals(studentID)){
                    mp2.computeIfAbsent(compannyID,k->new ArrayList<>()).add(x);
                }
            }
        }
        int k=Integer.parseInt(sc3.nextLine());
        while(k-->0){
            String companyId=sc3.nextLine();
            DN company=mp1.get(companyId);
            List<SinhVien> l=mp2.get(companyId);
            l.sort(new Comparator<SinhVien>() {
                public int compare(SinhVien x,SinhVien y){
                    return x.getId().compareTo(y.getId());
                }
            });
            System.out.println("DANH SACH THUC TAP TAI "+company.getName()+":");
            for(int i=0;i<Math.min(company.getsoluong(),l.size());i++){
                System.out.println(l.get(i));
            }
        }
    }
}