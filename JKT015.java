import java.util.*;
public class JKT015 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st1.isEmpty()&&s.charAt(i)=='<'){
                st2.push(st1.peek());
                st1.pop();
            }
            else if(!st2.isEmpty()&&s.charAt(i)=='>'){
                st1.push(st2.peek());
                st2.pop();
            }
            else if(!st1.isEmpty()&&s.charAt(i)=='-') st1.pop();
            else if(s.charAt(i)!='>'&&s.charAt(i)!='<'&&s.charAt(i)!='-') st1.push(s.charAt(i));
        }
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        while(!st2.isEmpty()){
            System.out.print(st2.pop());
        }
    }
}
