package app;

public class SalariedEmployee_3090{
    private String nama_3090, nip_3090;
    private int upahMingguan_3090;

    public SalariedEmployee_3090(String nama_3090, String nip_3090, int upahMingguan_3090){
        this.nama_3090 = nama_3090;
        this.nip_3090 = nip_3090;
        this.upahMingguan_3090 = upahMingguan_3090;
    }
    public int hitungGaji(){
        return upahMingguan_3090;
    }

    public void info(){
        System.out.println("===Salaried Employee===");
        System.out.println("Nama_3090          : " + nama_3090);
        System.out.println("Nip_3090           : " + nip_3090);
        System.out.println("Upah Mingguan : " + upahMingguan_3090);
        System.out.println("Total Gaji : " + hitungGaji());
    }
}