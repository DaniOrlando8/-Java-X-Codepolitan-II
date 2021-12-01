public class MyClass {
    static void printMessage(int num, String msg) {
        for (int i = 0; i < num; i++) {
            System.out.println(msg);
        }
    }
    public static void main(String[] args) {
            printMessage(10, "I LOVE YOU");
            printMessage(1, "JAVA!");
    }
}
/**
 * Lazimnya suatu bahasa pemrograman pasti mendukung sebuah function untuk dapat menerima parameter. Di Java, method 
   dapat menerima sejumlah parameter dengan tipe data tertentu.

String getMessage(String name){
      return "Hello " + name + "!";
}
Kemudian saat dipanggil dari bagian kode lain, kamu cukup melewatkan nilai sesuai dengan posisi parameter dan juga tipe 
data yang tepat yang telah kamu tentukan di pendefinisian method.

getMessage("Toni");
Bila kamu salah mengisi parameter, misalnya tipe data dari nilai yang dimasukkan tidak sama, maka akan muncul pesan error 
incompatible types.

Praktek
Silahkan eksekusi kode di sebelah kanan dan lihat output yang akan dihasilkan
Silahkan coba buat lagi method lain yang menampilkan informasi yang kamu inginkan dengan parameter yang kamu tentukan 
sendiri
 */