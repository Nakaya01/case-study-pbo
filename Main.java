public class Main {
    public static void main(String[] args) {

        BangunDatar[] koleksiBangunDatar = new BangunDatar[4];

        // 2. Mengisi array dengan berbagai objek yang berbeda (Polymorphism)
        koleksiBangunDatar[0] = new PersegiPanjang(10, 5);
        koleksiBangunDatar[1] = new Lingkaran(7);
        koleksiBangunDatar[2] = new Lingkaran(10);
        koleksiBangunDatar[3] = new PersegiPanjang(6, 8);

        System.out.println("--- Menghitung Luas dari Array of Objects ---");

        for (int i = 0; i < koleksiBangunDatar.length; i++) {
            String namaObjek = koleksiBangunDatar[i].getClass().getSimpleName();
            double luas = koleksiBangunDatar[i].hitungLuas();
            
            System.out.println("Luas " + namaObjek + " ke-" + (i + 1) + ": " + String.format("%.2f", luas));
        }
    }
}