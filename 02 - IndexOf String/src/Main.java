public class Main {
    public static void main(String[] args) {
        String status = "Pada hari minggu 19 Maret Fulan berjalan ke supermarket dan memebeli snack kentang.";

        System.out.println(status.indexOf("Fulan"));
        System.out.println(status.indexOf("Pada"));
        System.out.println(status.indexOf("Maret"));
    }
}
/**\
 * IndexOf String
Bila kita ingin mendapatkan posisi indeks dari suatu potongan string, kita dapat menggunakan method indexOf().

Nilai yang dikembalikan dari method ini adalah nilai integer untuk posisi huruf terkiri dari potongan string terhadap 
string yang diperiksa.

String status = "Pada hari minggu 19 Maret Fulan berjalan ke supermarket dan membeli lagi snack kentang.";
System.out.println(status.indexOf("Fulan")); // return 26
Bila substring yang dicari tidak ditemukan, maka method akan mengembalikan nilai -1.

Praktek
Silahkan eksekusi kode di sebelah kanan dan lihat output yang akan dihasilkan
 */