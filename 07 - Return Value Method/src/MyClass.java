public class MyClass {

    static int tambah(int num1, int num2){
        return num1 + num2;
    }

    static int kurang(int num1, int num2){
        return num1 - num2;
    }

    static int kali(int num1, int num2){
        return num1 * num2;
    }

    static double bagi(int num1, int num2){
        return num1 / num2;
    }
    
    public static void main(String[] args) {
        System.out.println(tambah(10, 20));
        System.out.println(kurang(10, 20));
        System.out.println(kali(10, 20));
        System.out.println(bagi(7, 4));
    }
}
/**
 * Return Value Method
Baik static ataupun non-static kita dapat mengembalikan suatu nilai dari dalam method. Untuk mengembalikan nilai 
ke luar method, kita gunakan statemen return.

Ada beberapa tipe data yang dapat kamu kembalikan, yaitu:

standard type, method mengembalikan nilai dari tipe standard Java
objek, method mengembalikan nilai berupa objek yang sesuai dengan class tertentu
array, method mengembalikan nilai berupa array dengan tipe data tertentu
Pada saat mendeklarasikan method, kita menyertakan tipe data sebelum nama methodnya. Tipe data method yang dideklarasikan 
harus sama dengan data yang akan dikembalikan dari dalam method tersebut.

Praktek
Pada editor terdapat contoh method bertipe integer dan mengembalikan nilai yang juga bertipe integer. Silakan eksekusi 
kode di sebelah kanan dan lihat output yang akan dihasilkan.
Dapatkah Kamu membuat method kurang() dan kali() bertipe integer, dan method bagi() bertipe double. Masing-masing method 
tersebut menerima dua buah parameter bertipe integer. Kemudian panggil semua method tersebut dari dalam method main().
 */
