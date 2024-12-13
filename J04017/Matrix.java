import java.util.*;
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
    public void setA(int[][] a){
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
    public Matrix trans(){
        int[][] b=new int[getM()][getN()];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                b[j][i]=a[i][j];
            }
        }
        Matrix tmp=new Matrix(getM(),getN());
        tmp.setA(b);
        return tmp;
    }
    public Matrix mul(Matrix b){
        int[][] c=new int[getN()][getN()];
        for(int k=0;k<getN();k++){
            for(int i=0;i<getN();i++){
                c[i][k]=0;
                for(int j=0;j<getM();j++){
                    c[i][k]+=a[i][j]*b.getA()[j][k];
                }
            }
        }
         Matrix tmp=new Matrix(getN(),getN());
         tmp.setA(c);
         return tmp;
    }
    public String toString(){
        String[] s=new String[n];
        for(int i=0;i<n;i++){
            s[i]="";
            for(int j=0;j<m;j++){
              s[i]+=String.format("%d",a[i][j])+" ";
            }
            s[i].trim();
        }
        return String.join("\n",s);
    }
}
