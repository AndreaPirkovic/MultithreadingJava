package pirkovic.andrea;
//Nit se moze napraviti za svaki objekat koji implementira interfejs Runnable
// da bi klasa implementirala interfejs Runnable potrebno je da ima metodu run(),
//koja je deklarisana u sledecem obliku : public void run()
//U metodi run() zadajete kod koji treba da se izvrsava u novoj niti.
// Kada se izvrsi metoda run() nit se unistava.
// primer za interfejs Runnable:
public class A implements Runnable {
	 
	public void run() { 
		for(int i =1; i<= 10; i++) {
			System.out.println(Thread.currentThread().getName());
			
			
		}
		
	}
}
