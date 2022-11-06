public class LaporanTahunan implements CetakLaporan, TampilLaporan{
    public void cetakA4(){
        System.out.println("Cetak Laporan di A4");
    }
    public void cetakA3(){
        System.out.println("Cetak Laporan di A3");
    }
	public void tampilWeb(){
        System.out.println("Tampil di Monitor");
    }
    public void tampilMobile(){
        System.out.println("Tampil di Handphone");
    }
	
    public static void main(String[] args) {        
        LaporanTahunan lt = new LaporanTahunan();
        lt.cetakA3();
        lt.cetakA4();
		lt.tampilMobile();
        lt.tampilWeb();
    }
}

interface CetakLaporan {
    public void cetakA4();
    public void cetakA3();
}