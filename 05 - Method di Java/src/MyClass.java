public class MyClass {

    String getURL(){
        return "https://www.codepolitan.com";
    }
    public static void main(String[] args) {
        MyClass myclass = new MyClass();
        System.out.println( myclass.getURL() );
    }
}
/**
 * Method di Java
Method adalah satu blok kode yang direferensikan dengan sebuah nama yang dapat dipanggil untuk dijalankan.

String getMessage()
{
      String message = "Hello world";
      return message;
}
Pada contoh di atas, kita membuat sebuah method yang berisi dua buah baris kode. Kedua baris kode tersebut akan 
dijalankan bilamana nama method tersebut dipanggil.

System.out.println( getMessage() );
Method dapat dipanggil dimana saja di dalam classnya, kecuali di dalam method static seperti method main(). 
Kita harus membuat objeknya terlebih dahulu dari class tersebut dengan menggunakan statemen new, baru kita dapat 
memanggil methodnya.

class ClassSaya
{
    String getURL() {
        return "https://www.codepolitan.com";
    }

    void printURL() {
        System.out.println( getURL() );
    }

    public static void main (String[] args) {
        ClassSaya myclass = new ClassSaya();
        myclass.printURL();
    }
}
Pada contoh di atas, kita mempunyai dua buah method bernama getURL() dan printURL(). Method getURL() isinya kode untuk 
mengembalikan string url. Method printURL() isinya mencetak string hasil pemanggilan method getURL().

Seperti kita lihat, method getURL() dapat dipanggil langsung di dalam method printURL(). tapi method printURL() tidak 
dapat langsung dipanggil di dalam method main(). Alasannya karena main() adalah method static. Sehingga kita harus 
menginstansiasi objeknya terlebih dahulu baru method tersebut dapat dipanggil melalui objeknya.

ClassSaya myclass = new ClassSaya();
myclass.printURL();
Lebih dalam pembahasan tentang Class dan Object dapat Kamu temukan di bagian selanjutnya.

Praktek
Jalankan kode di editor dan lihat output yang dihasilkan.
Buatlah satu method dengan nama getName() yang isinya mengembalikan nilai string "CodePolitan". Cetak hasil dari method 
tersebut di dalam method main().
Di dalam class, buat method seperti ini:

String getName(){
    return "CodePolitan";
}
dan di dalam method `main()` panggil method tersebut untuk mencetaknya:

System.out.println( myclass.getName() );
System.out.println( myclass.getURL() );
class MyClass {
​
    String getURL(){
        return "https://www.codepolitan.com";
    }
​
    public static void main (String[] args)
    {
        MyClass myclass = new MyClass();
        System.out.println( myclass.getURL() );
    }
}

 */