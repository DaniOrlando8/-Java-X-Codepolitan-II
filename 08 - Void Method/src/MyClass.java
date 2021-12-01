public class MyClass {
    static void getUrl(){
        System.out.println("https://www.codepolitan.com");
    }
    public static void main(String[] args) {
        MyClass myclass = new MyClass();
        myclass.getUrl();
    }
}
/**
 * Adakalanya kita hanya ingin membundel kode program di dalam sebuah method dan menjalankannya tanpa ingin mengembalikan
    nilai apapun. Untuk itu Kamu membutuhkan void method.

Void method sederhananya adalah method bertipe void dan di dalamnya tidak mengembalikan nilai apapun.

static void myMethod(){
      System.out.println("Hello from void method!");
}

Praktek
Silahkan eksekusi kode di sebelah kanan dan lihat output yang akan dihasilkan
Karena method getURL() adalah method static, Kamu dapat memanggil langsung method tersebut di dalam method main() 
tanpa harus menginstansiasi objeknya terlebih dahulu
getURL();

 */