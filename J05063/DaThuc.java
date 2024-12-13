public class DaThuc {
    private String s;
    public DaThuc(String s){
        this.s=s;
    }
    public String getS(){
        return s;
    }
    public DaThuc cong(DaThuc b){
        int[] a=new int[10001];
       String[] ss=s.split("\\+");
       for(String x:ss){
            x=x.trim();
            String[] part=x.split("\\*x\\^");
            int heso=Integer.parseInt(part[0]);
            int mu=Integer.parseInt(part[1]);
            a[mu]+=heso;
       }
       String[] ss1=b.getS().split("\\+");
       for(String x:ss1){
        x=x.trim();
        String[] part=x.split("\\*x\\^");
        int heso=Integer.parseInt(part[0]);
        int mu=Integer.parseInt(part[1]);
        a[mu]+=heso;
   }
   StringBuilder re = new StringBuilder();
        for (int i = 10000; i >= 0; i--) {
            if (a[i]>0) { // Chỉ lấy những hạng tử có hệ số khác 0
                if (re.length() > 0) {
                    re.append(" + ");
                }
                re.append(String.format("%d*x^%d", a[i], i));
            }
        }
        DaThuc tmp=new DaThuc(re.toString());
        return tmp;
    }
    public String toString(){
        return s;
    }
}
