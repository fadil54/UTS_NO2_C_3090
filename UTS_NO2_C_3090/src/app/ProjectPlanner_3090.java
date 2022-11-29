package app;

public class ProjectPlanner_3090 {
    private String nama_3090, nip_3090;
    private int gajiPokok_3090, komisi_3090, totalHasilProyek_3090;
    
    public ProjectPlanner_3090(String nama_3090, String nip_3090, int gajiPokok_3090, int komisi_3090, int totalHasilProyek_3090){
        this.nama_3090 = nama_3090;
        this.nip_3090 = nip_3090;
        this.gajiPokok_3090 = gajiPokok_3090;
        this.komisi_3090 = komisi_3090;
        this.totalHasilProyek_3090 = totalHasilProyek_3090;
    }
    public double hitungGaji(){
        return gajiPokok_3090 + (komisi_3090 * totalHasilProyek_3090);
    }

    public void info(){
        System.out.println("===Project Planner===");
        System.out.println("Nama_3090               : " + nama_3090);
        System.out.println("Nip_3090                : " + nip_3090);
        System.out.println("Gaji Pokok         : " + gajiPokok_3090);
        System.out.println("Komisi_3090             : " + komisi_3090);
        System.out.println("Total Hasil Proyek : " + totalHasilProyek_3090);
        System.out.println("Total Gaji         : " + hitungGaji());
    }
}
