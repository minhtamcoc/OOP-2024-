import java.util.*;
class Pair<T1,T2>{
    private T1 t1;
    private T2 t2;
    private boolean nto(Integer n){
        if(n<1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public Pair(T1 t1,T2 t2){
        this.t1=t1;
        this.t2=t2;
    }
    public boolean isPrime(){
        return nto((Integer) t1)&&nto((Integer) t2);
    }
    public String toString(){
        return t1+" "+t2;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}