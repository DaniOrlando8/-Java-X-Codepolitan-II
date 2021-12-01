class DocumentPage {
    private int width = 0;
    private int height = 0;
    private String docType = "";
    private String orientation = "";

    public DocumentPage(int width, int height, String docType, String orientation){
        // untuk membedakan variabel lokal dengan variabel class
        // gunakan kata kunci "this" untuk merujuk ke variabel class
		this.width = width;
		this.height = height;
		this.docType = docType;
		this.orientation = orientation;
    }

    public void getDocumentInfo()
	{
		System.out.println("Document width: " + this.width);
		System.out.println("Document height: " + this.height);
		System.out.println("Document type: " + this.docType);
		System.out.println("Document orientation: " + this.orientation);
	}
}
class Main {
    public static void main(String[] args) throws Exception {
        DocumentPage dp = new DocumentPage(25, 11, "A4", "landscape");
		dp.getDocumentInfo();
    }
}
/**
 * Constructor
Method constructor adalah method yang akan selalu dipanggil setiap kali kita membuat objek dari class tersebut. 
Nama method constructor sama dengan nama classnya tanpa mendefinisikan tipe data method.

class Hello {
      void Hello(String name){
          // kode
      }
}
Bila method constructor memiliki parameter seperti contoh di atas, maka kita harus mengisi parameter tersebut saat 
instansiasi objek. Bila tidak, compiler akan menampilkan pesan error.

Hello hello = new Hello("Ridwan");
Bila constructor membutuhkan dua buah parameter, maka kita juga harus mengisi kedua parameter tersebut.

Praktek
Pada editor terdapat 2 buah class DocumentPage dan Main. Class DocumentPage memiliki 4 buah property dan 2 buah method. 
Method DocumentPage() adalah method constructor dan memiliki 4 buah parameter untuk diisikan ke property class. 
Silakan eksekusi kode di sebelah kanan dan lihat output yang akan dihasilkan
Coba ubah nilai konstruktor pada baris kode saat instansiasi.
Cobalah buat objek lain dari class DocumentPage di dalam method main()
 */