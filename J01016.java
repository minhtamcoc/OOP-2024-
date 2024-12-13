import java.util.*;
public class J01016 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        Map<Character,Integer> mp=new HashMap<>();
        for(char x:s.toCharArray()){
            if(mp.containsKey(x)){
                mp.put(x, mp.get(x)+1);
            }
            else{
                mp.put(x,1);
            }
        }
        int tmp = mp.getOrDefault('4', 0) + mp.getOrDefault('7', 0);
       if(tmp==4||tmp==7) System.out.println("YES");
       else System.out.println("NO");
    }
}
