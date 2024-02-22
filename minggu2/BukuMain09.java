public class BukuMain09 {
    public static void main(String[] args) {

        Buku09 bk1 = new Buku09();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.hitungDiskon();
        bk1.tampilInformasi();

        Buku09 bk2 = new Buku09("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk1.hitungDiskon();
        bk2.tampilInformasi();


        Buku09 Ericha = new Buku09("00.00", "Ameylia Falensia", 284, 17, 99000 );
        Ericha.terjual(9);
        Ericha.hitungDiskon();
        Ericha.tampilInformasi();

        Buku09 bk3 = new Buku09("Rindu", "Tere Liye", 597, 34, 198000);
        bk3.terjual(12);
        bk3.hitungDiskon();
        bk3.tampilInformasi();
    }
}
