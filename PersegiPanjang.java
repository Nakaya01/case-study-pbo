// Merepresentasikan Persegi Panjang, sebuah kelas konkret turunan dari BangunDatar.
public class PersegiPanjang extends BangunDatar {

    // Atribut privat untuk dimensi persegi panjang.
    private double panjang;
    private double lebar;

    // Konstruktor untuk membuat objek PersegiPanjang baru dengan dimensi spesifik.
    // parameter panjang Panjang dari persegi panjang.
    // parameter lebar   Lebar dari persegi panjang.
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Menyediakan implementasi untuk menghitung luas persegi panjang.
    // Metode ini menimpa (override) metode abstrak dari kelas induk.
    // @return Luas yang dihitung dari panjang kali lebar.
    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }
}