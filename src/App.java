import models.Koki;
import models.Pegawai;
import models.Satpam;

public class App {
    public static void main(String[] args) throws Exception {
        Pegawai pegawai = new Pegawai();
        Koki koki = new Koki();
        Satpam satpam = new Satpam();

        koki.gaji = 40000;
        satpam.gaji = 30000;

        koki.tampil();
        System.out.println("Gaji koki " + koki.gaji);
        System.out.println("Gaji satpam " + satpam.gaji);
        pegawai.tugas();
        koki.tugas();
        satpam.tugas();
        
    }
}
