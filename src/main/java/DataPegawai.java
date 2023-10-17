// Frisca Destar Suhertal
// 2211103065
// SI 06 B

class DataPegawai {
    //atributes
    private String nip;
    private String nama;
    private String alamat;
    private double jmlh_hari_lembur;
    private double gaji_pokok;
    private double total_gaji;
    //methods
    public DataPegawai()
    { //constructor
        System.out.println("Konstruktor pegawai dijalankan...");
    }
    //fungsi-fungsi mutator

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getJmlh_hari_lembur() {
        return jmlh_hari_lembur;
    }

    public void setJmlh_hari_lembur(float jmlh_hari_lembur) {
        this.jmlh_hari_lembur = jmlh_hari_lembur;
    }

    public double getGaji_pokok() {
        return gaji_pokok;
    }

    public void setGaji_pokok(double gaji_pokok) {
        this.gaji_pokok = gaji_pokok;
    }

    //method overloading
    public void setTotalGaji(double Jmlh_hari_lembur, double Gaji_pokok)
    {
        jmlh_hari_lembur = Jmlh_hari_lembur;
        gaji_pokok = Gaji_pokok;
        total_gaji = gaji_pokok + (gaji_pokok * jmlh_hari_lembur *0.01);
    }
    public void setTotalGaji(double Gaji_pokok)
    {
        jmlh_hari_lembur = 12;
        gaji_pokok = Gaji_pokok;
        total_gaji = gaji_pokok + (gaji_pokok * jmlh_hari_lembur *0.01);
    }
    public void cetakKeLayar()
    {
        System.out.println("NIP : "+getNip());
        System.out.println("Nama : "+getNama());
        System.out.println("Alamat : "+getAlamat());
        System.out.println("Jumlah hari lembur : " +getJmlh_hari_lembur()+" hari");
        System.out.println("Gaji pokok : "+getGaji_pokok());
        System.out.println("Total gaji : "+total_gaji);

        System.out.println("");
    }
}