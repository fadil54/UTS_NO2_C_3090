package app;

public class CommissionEmployee_3090 {
    private String nama_3090, nip_3090;
    private int gajiPokok_3090, komisi_3090, totalPenjualan_3090;

    public CommissionEmployee_3090(String nama_3090, String nip_3090, int gajiPokok_3090, int komisi_3090, int totalPenjualan_3090){
        this.nama_3090 = nama_3090;
        this.nip_3090 = nip_3090;
        this.gajiPokok_3090 = gajiPokok_3090;
        this.komisi_3090 = komisi_3090;
        this.totalPenjualan_3090 = totalPenjualan_3090;
    }
    public int hitungGaji(){
        return gajiPokok_3090 + (komisi_3090 * totalPenjualan_3090);
    }
    public void info(){
        System.out.println("===Commision Employee===");
        System.out.println("nama_3090               : " + nama_3090);
        System.out.println("Nip                     : " + nip_3090);
        System.out.println("Gaji Pokok              : " + gajiPokok_3090);
        System.out.println("Komisi_3090             : " + komisi_3090);
        System.out.println("Total Penjualan         : " + totalPenjualan_3090);
        System.out.println("Total Gaji              : " + hitungGaji());
    }
}
