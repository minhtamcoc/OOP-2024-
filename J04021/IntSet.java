import java.util.*;
public class IntSet {
    private int a[];
    public IntSet(int a[]){
    this.a=Arrays.copyOf(a,a.length);
    }
    public int[] getA(){
        return a;
    }
    public IntSet union(IntSet b){
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<getA().length;i++){
            st.add(getA()[i]);
        }
        for(int i=0;i<b.getA().length;i++){
            st.add(b.getA()[i]);
        }
        int[] c=new int[st.size()];
        int idx=0;
        for(Integer x:st){
            c[idx]=x;
            idx++;
        }
        IntSet k=new IntSet(c);
        return k;
    }
    public int getSIZE(){
        return a.length;
    }
    @Override
    public String toString(){
        String tmp="";
        for(int i=0;i<getA().length;i++){
            tmp+=String.format("%d",a[i])+" ";
        }
        return tmp.trim();
    }
}