import java.util.*;
public class J03027 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> st=new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(!st.isEmpty()&&s.charAt(i)==st.peek()) st.pop();
            else st.push(s.charAt(i));
        }
        String tmp="";
        while(!st.isEmpty()){
            char x=st.peek();
            tmp=x+tmp;
            st.pop();
        }
        if(tmp.isEmpty()) System.out.println("Empty String");
        else System.out.println(tmp);
    }
}
