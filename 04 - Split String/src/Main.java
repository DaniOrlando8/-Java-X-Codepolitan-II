import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String ibukota = "Banten, Bandung, Jakarta, Semarang, Yogyakarta, Surabaya";
        String[] ibukota_array = ibukota.split(",");
      
		System.out.println(Arrays.toString(ibukota_array));
    }
}
/**
 * Split String
String yang panjang dapat dibagi-bagi atau dipecah berdasarkan karakter yang ditentukan sebagai pemecahnya. 
Karakter pembagi bisa saja sebuah koma, spasi, atau tanda baca lainnya sesuai keinginan. 
Untuk melakukan hal tersebut, kita gunakan method split(). Hasil dari pemanggilan method tersebut adalah array string.

String nama = "Muhammad Singgih";
System.out.println(Arrays.toString(nama.split(" ")));
Contoh kode di atas akan menghasilkan output "[Muhammad, Singgih]".

Praktek
Silahkan eksekusi kode di sebelah kanan dan lihat output yang akan dihasilkan
Dapatkah Kamu mencetak daftar kota tersebut sehingga tampil seperti ini:
Nama-nama ibu kota di pulau Jawa:
1. Banten
2. Bandung
3. Jakarta
4. Semarang
5. Yogyakarta
6. Surabaya
Gunakan perulangan for:

int x = 1;
System.out.println("Nama-nama ibu kota di pulau Jawa:");
for (String i: ibukota_array){
    System.out.printf("%d. %s \n", x, i);
    x++;
}
 */