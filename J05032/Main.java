import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Person> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name=sc.next();
            String age=sc.next();
            list.add(new Person(name,age));
        }
        list.sort(new Comparator<Person>() {
            public int compare(Person x,Person y){
                if(x.getYear()!=y.getYear()) return Integer.compare(x.getYear(),y.getYear());
                if(x.getMonth()!=y.getMonth()) return Integer.compare(x.getMonth(),y.getMonth());
                return Integer.compare(x.getDay(),y.getDay());
            }
        });
        System.out.println(list.get(list.size()-1));
        System.out.println(list.get(0));
    }
}
// 5
// Nam 01/10/1991
// An 30/12/1990
// Binh 15/08/1993
// Tam 18/09/1990
// Truong 20/09/1990