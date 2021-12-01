class MyClass {
   
    static String getUrl(){
       return "https://www.codepolitan.com";
   }

   public static void main(String[] args) {
       MyClass myclass = new MyClass();
        System.out.println( myclass.getUrl());
   }
}
/*
    Static Method
Ada dua jenis method yang dapat kamu buat di Java, yaitu static dan non-static. Pada tutorial sebelumnya kita sudah 
belajar membuat method yang pada dasarnya adalah method non-static. Adapun untuk membuat method static adalah dengan 
menambahkan kata kunci static sebelum menuliskan tipe data dan nama dari methodnya.

static String getURL(){
    return "https://www.codepolitan.com";
}
Static method dapat langsung dipanggil dari manapun di dalam class tersebut tanpa harus membuat objeknya terlebih dahulu, 
termasuk dari dalam method static seperti method main().

Praktek
Silakan eksekusi kode di sebelah kanan dan lihat output yang dihasilkan
Kali ini method getURL() sudah menjadi method static. Tambahkan kode berikut untuk memanggil method tersebut secara 
langsung di dalam method main() di baris ke-12.
System.out.println( getURL() );
*/