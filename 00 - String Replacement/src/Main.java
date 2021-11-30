public class Main {
    public static void main(String[] args) {
        String txt1 = "Satu sendok garam dan dua sendok gula";
        
        System.out.println(txt1.replace("sendok", "Sekop"));
        System.out.println(txt1.replaceFirst("sendok", "Sekop"));
    }
}
/**
 * String Replacement
Kita dapat mengganti suatu potongan string dengan string lainnya dengan menggunakan method replace().

String kalimat = "pisang yang mentah tidak sama dengan pisang yang matang.";
nama.replace("pisang", "apel");
Pada contoh di atas, semua kata pisang yang ditemukan pada string kalimat akan diganti menjadi apel.

Adakalanya kita hanya ingin mengganti string yang ditemukan pertama kali saja. Untuk itu kita dapat menggunakan method 
replaceFirst().

Praktek
Silakan eksekusi kode di sebelah kanan dan lihat output yang dihasilkan.
 */