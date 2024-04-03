import java.util.Scanner;

public class Biodata {
    private String nama;
    private String jenisKelamin;
    private String agama;
    private String tempattinggal;
    private String tanggallahir;
    private String NIS;

    public Biodata (String nama, String jenisKelamin, String agama, String tempattinggal, String tanggallahir, String NIS) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.agama = agama;
        this.tempattinggal = tempattinggal;
        this.tanggallahir = tanggallahir;
        this.NIS = NIS;
    }

    public String getNama() {
        return nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getAgama() {
        return agama;
    }

    public String getTempatTinggal() {
        return tempattinggal;
    }

    public String getTanggalLahir() {
        return tanggallahir;
    }

    public String getNIS() {
        return NIS;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin: ");
        String jenisKelamin = scanner.nextLine();

        System.out.print("Masukkan agama: ");
        String agama = scanner.nextLine();

        System.out.print("Masukkan tempat tinggal");
        String tempatTinggal = scanner.nextLine();

        System.out.print("Masukkan tanggal lahir");
        String tanggalLahir = scanner.nextLine();

        System.out.print("Masukkan NIS: ");
        String NIS = scanner.nextLine();

        Biodata biodata= new Biodata(nama, jenisKelamin, agama, tempatTinggal, tanggalLahir,  NIS);

        System.out.println("\nBiodata:");
        System.out.println("Nama: " + biodata.getNama());
        System.out.println("Jenis Kelamin: " + biodata.getJenisKelamin());
        System.out.println("Agama: " + biodata.getAgama());
        System.out.println("tempat Tinggal: " + biodata.getTempatTinggal());
        System.out.println("Tanggal Lahir: " + biodata.getTanggalLahir());
        System.out.println("NIS: " + biodata.getNIS());

        scanner.close();
    }
}
