import java.util.*;
public class J03009 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            String[] ss1=s1.split(" ");
            String[] ss2=s2.split(" ");
            TreeMap<String,Integer> mp=new TreeMap<>();
            for(String x:ss2){
                if(mp.containsKey(x)){
                    mp.put(x,mp.get(x)+1);
                }
                else mp.put(x,1);
            }
            TreeSet<String> st=new TreeSet<>();
            for(String x:ss1){
                if(!mp.containsKey(x)){
                    st.add(x);
                }
            }
            for(String x:st){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
