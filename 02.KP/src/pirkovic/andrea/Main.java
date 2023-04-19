package pirkovic.andrea;

// pokretanje nove niti
//novu nit pokrecete tako sto napravite instancu objekta tipa Thread
// To se moze uraditi na 2 nacina
//1. nacin podrazumeva implementaciju interfejsa Runnable
//2.nacin prosirivanjem klase Thread






public class Main {

	public static void main(String[] args) {
		
		A a= new A();
		//Oblik konstruktora: Thread(Runnable objekatNit, string imeNiti)
		// objekatNit je instanca klase koja implementira interfejs Runnable
		// definise mesto gde zapocinje nit
		//imeNiti predstavlja ime nove niti (koje vi zadajete)
		Thread t1 = new Thread(a, "Nit1");
		Thread t2 = new Thread(a, "Nit2");
		Thread t3 = new Thread(a, "Nit3");
		
		t1.start();// metoda start() poziva metodu run() i odredjuje kada ce se izvrsavati.
		// metoda run() oderdjuje sta ce se izvrsavati
		t2.start();
		t3.start();
		
		
		
		
	}

}
