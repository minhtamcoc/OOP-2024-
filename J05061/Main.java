import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Person> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name=sc.nextLine();
            String age=sc.nextLine();
            double lythuyet=sc.nextDouble();
            double thuchanh=sc.nextDouble();
            sc.nextLine();
            list.add(new Person(name,age,lythuyet,thuchanh));
        }
        list.sort(new Comparator<Person>() {
            public int compare(Person x,Person y){
                if(x.getT()==y.getT()) return x.getId().compareTo(y.getId());
                return Long.compare(y.getT(),x.getT());
            }
        });
        for(Person x:list){
            System.out.println(x);
        }
    }
}
// 3
// Doan Thi Kim
// 13/03/1982
// 8
// 9.5
// Dinh Thi Ngoc Ha
// 03/09/1996
// 6.5
// 8
// Tran Thanh Mai
// 12/09/2004
// 8
// 9