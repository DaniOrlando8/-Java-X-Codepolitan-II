class Document {

	public Document () {
		System.out.println("Ini adalah constructor Document()...");
	}

	public void getOrientation() {
		System.out.println("Mengambil orientasi document");
	}
}

class XlsDocument extends Document {
	public XlsDocument () {
		System.out.println("Ini adalah constructor XlsDocument()...");
	}
	
	public void getSheet() {
		System.out.println("Mengambil sheet XlsDocument");
	}
}

class DocDocument extends Document {
	public DocDocument () {
		System.out.println("Ini adalah constructor DocDocument()...");
	}
	
	public void getPage() {
		System.out.println("Mengambil halaman DocDocument");
	}
}

class PptDocument extends Document{
	public PptDocument () {
		System.out.println("Ini adalah constructor PptDocument()...");
	}
	
	public void getSlide() {
		System.out.println("Mengambil slide PptDocument");
	}
}

class Main {
	public static void main (String[] args) {
		Document doc = new Document();
		doc.getOrientation();

		System.out.println("");

		XlsDocument doc1 = new XlsDocument();
		doc1.getOrientation();
		doc1.getSheet();

		System.out.println("");
		
		DocDocument doc2 = new DocDocument();
		doc2.getOrientation();
		doc2.getPage();

		System.out.println("");
		
		PptDocument doc3 = new PptDocument();
		doc3.getOrientation();
		doc3.getSlide();
				
	}
}
/**
 * Class Inheritance
Inheritance secara bahasa artinya pewarisan. Dalam pemrograman berorientasi objek, inheritance adalah pewarisan suatu 
class kepada class yang lain, atau suatu class menjadi landasan bagi class lain. Dengan menggunakan inheritance kamu 
cukup sekali mendefinisikan suatu method atau property dan method atau property tersebut dapat digunakan di class lain 
yang mewarisi class tersebut.

class Hello {
      String message = "Hello world";

      void getMessage() {
          return message;
      }
}

class HelloCoder extends Hello {
      // class ini otomatis memiliki 
      // method getMessage() dan property message
}
Walaupun tanpa mendefinisikan method getMessage(), kamu dapat memanggil method tersebut dari class turunan ketika dibuat 
objeknya. Untuk melakukan inheritance kamu harus menggunakan keyword extends diikuti nama class yang ingin diwarisi.

Selain itu kamu pun dapat menimpa proses yang ada di dalam constructor atau suatu method dikenal dengan istilah method 
overriding.

class Hello {
      String message = "Hello world";

      void getMessage() {
          return message;
      }
}

class HelloCoder extends Hello {
      // override method
      void getMessage() {
          message = "Hello Coders!";
          return message;
      }
}
Pada contoh kode di atas, bila method getMessage() dipanggil dari objek class HelloCoder, maka nilai yang dikembalikan 
adalah nilai dari method getMessage() yang dimiliki HelloCoder, bukan lagi dari method induknya.

Praktek
Silahkan eksekusi kode di sebelah kanan dan lihat output yang akan dihasilkan
Buatlah objek lain di dalam class utama dari class-class yang telah dibuat.
 */