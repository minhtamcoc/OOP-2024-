import java.util.*;
import java.io.*;;
public class Main {
    public static String chuanhoa(String s){
        String[] arr=s.split("\\s+");
        StringBuilder b=new StringBuilder();
        for(String x:arr){
            char tmp=Character.toUpperCase(x.charAt(0));
            b.append(tmp).append(x.substring(1)).append(" ");
        }
        return b.toString().trim();
    }
    public static String chuanhoaten(String s){
        String[] arr=s.split(" ");
        return arr[arr.length-1];
    }
    public static String chuanhoaHodem(String s){
        String tmp="";
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length-1;i++){
            tmp+=arr[i];
        }
        return tmp;
    }
    public static void main(String[] args) throws FileNotFoundException {
        File f=new File("DANHSACH.in");
        List<HoTen> list=new ArrayList<>();
        Scanner sc=new Scanner(f);
        while(sc.hasNextLine()){
            String name=sc.nextLine().toLowerCase().trim();
            name=chuanhoa(name);
            String ten=chuanhoaten(name);
            String hodem=chuanhoaHodem(name);
            list.add(new HoTen(name, ten, hodem));
        }
        list.sort(new Comparator<HoTen>() {
            public int compare(HoTen x,HoTen y){
                if(x.getTen().equals(y.getTen())){
                    return x.getHodem().compareTo(y.getHodem());
                }
                return x.getTen().compareTo(y.getTen());
            }
        });
        for(HoTen x:list){
            System.out.println(x);
        }
    }
}