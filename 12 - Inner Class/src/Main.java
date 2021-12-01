class A {
	public A() {
		System.out.println("ini adalah kelas A. Ada di luar class Main.");
	}
}

class Main {

	static class B {
		public B() {
			System.out.println("ini adalah kelas B. Ada di dalam class Main.");
		}
	}

	public void InnerClass() {
		System.out.println("ini adalah kelas InnerClass. InnerClass adalah main class.");
	}

	public static void main (String[] args) {
		A a = new A();
		B b = new B();
		Main ic = new Main();
	}
}
/**
 * Inner Class
Sesuai namanya, inner class adalah class yang didefinisikan berada di dalam class lain. Di Java, untuk membuat 
inner class biasanya menggunakan keyword static di depan nama inner class.

Hanya saja inner class hanya dapat diakses dari dalam class pemiliknya. Class lain tidak dapat menggunakan inner class 
yang dimiliki suatu class.

Praktek
Silahkan eksekusi kode di sebelah kanan dan lihat output yang akan dihasilkan
Buatlah inner class lain di dalam class utama
 * 
 */