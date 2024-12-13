import java.util.*;
public class J08020 {
    public static int check(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char tmp=s.charAt(i);
            if(tmp=='('||tmp=='['||tmp=='{') st.push(tmp);
            else{
                if(!st.isEmpty()&&tmp==')'&&st.peek()=='(') st.pop();
                else if(!st.isEmpty()&&tmp==']'&&st.peek()=='[') st.pop();
                else if(!st.isEmpty()&&tmp=='}'&&st.peek()=='{') st.pop();
            }
        }
        if(st.isEmpty()) return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            if(check(s)==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
