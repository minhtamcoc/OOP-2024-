package J07037;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("DN.in");
        try (Scanner sc = new Scanner(f)) {
            List<DOANH_NGHIEP> list = new ArrayList<>();
            int t = Integer.parseInt(sc.nextLine());

            while (t-- > 0) {
                String code = sc.nextLine();
                String name = sc.nextLine();
                int sl = Integer.parseInt(sc.nextLine());
                list.add(new DOANH_NGHIEP(code, name, sl));
            }

            list.sort(new Comparator<DOANH_NGHIEP>() {
                @Override
                public int compare(DOANH_NGHIEP x, DOANH_NGHIEP y) {
                    return x.getCode().compareTo(y.getCode());
                }
            });

            for (DOANH_NGHIEP x : list) {
                System.out.println(x);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
