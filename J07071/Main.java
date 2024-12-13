import java.util.*;
import java.io.*;
public class Main {
    public static boolean check(String s,String re){
        String[] ans=re.split(" ");
        StringBuilder tmp=new StringBuilder();
        for(String x:ans){
            if(!x.isEmpty()){
                char k=Character.toUpperCase(x.charAt(0));
                tmp.append(k).append(".");
            }
        }
        String re1=tmp.toString();
        re1=re1.substring(0,re1.length()-1);
        if(re1.length()!=s.length()) return false;
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=re1.charAt(i)) cnt++;
        }
        if(cnt>1) return false;
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException{
        File f=new File("DANHSACH.in");
        Scanner sc=new Scanner(f);
        int t=Integer.parseInt(sc.nextLine());
        List<DanhSach> list=new ArrayList<>();
        while(t-->0){
            String name=sc.nextLine();
            list.add(new DanhSach(name));
        }
        t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            List<String> list2=new ArrayList<>();
            String s=sc.nextLine();
            for(DanhSach x:list){
                if(check(s,x.getName())) list2.add(x.getName());
            }
            list2.sort(new Comparator<String>() {
                public int compare(String a,String b){
                    String[] ss1=a.split(" ");
                    String[] ss2=b.split(" ");
                    if(ss1[ss1.length-1]!=ss2[ss2.length-1]) return ss1[ss1.length-1].compareTo(ss2[ss2.length-1]);
                    String re1="";
                    String re2="";
                    for(int i=0;i<ss2.length-1;i++){
                        re1+=ss1[i]+" ";
                        re2+=ss2[i]+" ";
                    }
                    return re1.trim().compareTo(re2.trim());
                }
            });
            for(String x:list2){
                System.out.println(x);
            }
        }
    }
}