// Merepresentasikan Lingkaran, sebuah kelas konkret turunan dari BangunDatar.
public class Lingkaran extends BangunDatar {

    // Atribut privat untuk radius lingkaran.
    private double radius;

    // Konstruktor untuk membuat objek Lingkaran baru dengan radius spesifik.
    // parameter radius Jari-jari dari lingkaran.
    public Lingkaran(double radius) {
        this.radius = radius;
    }

    // Menyediakan implementasi untuk menghitung luas lingkaran.
    // Metode ini menimpa (override) metode abstrak dari kelas induk.
    // @return Luas yang dihitung menggunakan rumus PI * r^2.
    @Override
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }
}