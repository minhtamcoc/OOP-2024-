public class DanhSach {
    static int idx=0;
        private String id;
        private String ngaythi;
        private String giothi;
        private String phongthi;
        private int Day;
        private int Month;
        private int Year;
        private int gio;
        private int phut;
        public DanhSach(String ngaythi,String giothi,String phongthi){
            idx++;
            this.id="C"+String.format("%03d",idx);
            this.ngaythi=ngaythi;
            this.giothi=giothi;
            this.phongthi=phongthi;
            String[] ss=giothi.split(":");
            String[] ss1=ngaythi.split("/");
            this.gio=Integer.parseInt(ss[0]);
            this.phut=Integer.parseInt(ss[1]);
            this.Day=Integer.parseInt(ss1[0]);
            this.Month=Integer.parseInt(ss1[1]);
            this.Year=Integer.parseInt(ss1[2]);
        }
        public int getH(){
            return gio;
        }
        public int getP(){
            return phut;
        }
        public String getId(){
            return id;
        }
        public int getDay(){
            return Day;
        }
        public int getMonth(){
            return Month;
        }
        public int getYear(){
            return Year;
        }
        public String toString(){
            return id+" "+ngaythi+" "+giothi+" "+phongthi;
        }
}
