import java.util.Scanner;

public class Matrix {
    private int[][] a;
    private int n;
    private int m;
    public Matrix(int n,int m){
        this.n=n;
        this.m=m;
        this.a=new int[n][m];
    }
    public void nextMatrix(Scanner sc){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
    }
    public void set(int[][] a){
        this.a=a;
    }
    public int[][] getA(){
        return a;
    }
    public int getN(){
        return n;
    }
    public int getM(){
        return m;
    }
    public Matrix mul(Matrix b){
        int[][] c=new int[getN()][b.getM()];
        for(int k=0;k<b.getM();k++){
            for(int i=0;i<getN();i++){
                c[i][k]=0;
                for(int j=0;j<getM();j++){
                    c[i][k]+=a[i][j]*b.getA()[j][k];
                }
            }
        }
        Matrix tmp=new Matrix(getN(),b.getM());
        tmp.set(c);
        return tmp;
    }
    public String toString(){
        String[] ss=new String[n];
        for(int i=0;i<n;i++){
            ss[i]="";
            for(int j=0;j<m;j++){
               ss[i]+=String.format("%d",a[i][j])+" ";
            }
            ss[i].trim();
        }
        return String.join("\n",ss);
    }
}
