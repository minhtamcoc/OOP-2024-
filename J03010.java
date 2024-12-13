import java.util.*;
public class J03010 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        Map<String,Integer> mp=new HashMap<>();
        while(t-->0){
            String s=sc.nextLine().toLowerCase().trim();
            String[] arr=s.split("\\s+");
            String tmp=arr[arr.length-1];
            for(int i=0;i<arr.length-1;i++){
                tmp+=arr[i].charAt(0);
            }
            if(mp.containsKey(tmp)){
                mp.put(tmp,mp.get(tmp)+1);
                int n=mp.get(tmp);
                tmp+=(n);
            }
            else mp.put(tmp,1);
            tmp+="@ptit.edu.vn";
            System.out.println(tmp);
        }
    }
}
