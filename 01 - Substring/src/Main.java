public class Main {
    public static void main(String[] args) throws Exception {
        String txt1 = "Lorem Ipsum Sit Dolor Amet";

        System.out.println(txt1.startsWith("Lorem"));
        System.out.println(txt1.endsWith("Amet"));
        System.out.println(txt1.substring(5,11));
    }
}
/**
 * Substring
Kita dapat memeriksa apakah suatu string diawali oleh potongan string tertentu dengan menggunakan method startWith(). 
Kita juga dapat mengecek apakah suatu string diakhiri oleh potongan string tertentu dengan menggunakan endWith(). 
Kedua method ini akan mengembalikan nilai true bila ditemukan dan false bila tidak ditemukan.

String nama = "Ahmad Oriza Sahputra";
System.out.println(nama.startsWith("Ahmad")); // return true
System.out.println(nama.endsWith("Oriza")); // return false
System.out.println(nama.endsWith("putra")); // return true
Selain itu kita juga dapat mengambil suatu substring dari suatu string dengan menggunakan method substring().

String nama = "Ahmad Oriza Sahputra";
System.out.println(nama.substring(6, 11)); // return "Oriza"
Parameter pertama adalah indeks awal string, dan parameter kedua adalah indeks akhir dari string yang ingin diambil. 
Indeks string dimulai dari 0 yakni untuk karakter pertama pada string.

Praktek
Silahkan eksekusi kode di sebelah kanan dan lihat output yang akan dihasilkan
 */