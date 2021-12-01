class Hello {
    private String message = "Hello World";
    
    public void printMessage(){
        System.out.println(message);
    }

    public String getMessage() {
		return message;
	}
}
class Main {
    public String getMessage(){
        return "Pesan ini berasal dari InstantiateClass yang diinstansi";
    }

    public static void main(String[] args) {
        //instansi class Hello
        Hello hello = new Hello();
        hello.printMessage();
        System.out.println(hello.getMessage());

        Main main = new Main();
        System.out.println(main.getMessage());
    }
}
/**
 * Instansiasi Class
Sebuah class terdiri dari beberapa bagian berikut:

atribut, variabel yang menjadi milik class tersebut dengan tipe data tertentu dan tingkat akses tertentu
konstruktor, method yang akan selalu dipanggil saat kita membuat objek (instansiasi) dari class tersebut
method, fungsi yang dimiliki oleh class dan akan melakukan suatu operasi bila dipanggil
Kamu dapat menggunakan suatu class dengan melakukan apa yang disebut dengan instantiation atau instansiasi. 
Sebuah class dapat digunakan setelah berbentuk objek. Misal ketika kamu ingin melakukan operasi terhadap file XML atau 
JSON, kamu harus membuat objek dari clas JSONParser untuk mulai melakukan operasi terhadap file JSON tersebut.

Sederhananya secara default bila kita ingin menggunakan suatu method dari suatu class, kita harus membuat objeknya 
terlebih dahulu.

// instansiasi objek
NamaClass namaobjek = new NamaClass(params);

// menggunakan method objek
namaobjek.namaMethod();
Praktek
Pada editor terdapat contoh kode berisi dua buah class Hello dan Main. Silahkan eksekusi kode tersebut dan pelajari 
output dan struktur kodenya
 */