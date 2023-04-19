package pirkovic.andrea;

// Nit se moze napraviti i kada klasu Thread prosirite novom nasledjenom klasom
// a zatim napravite instancu te klase.
// nova potklasa mora da redefinise metodu run()
// primer za nasledjivanje klase Thread

public class A extends Thread{
	
	A(String s){
		super(s); // poziva se konstruktor Thread sledeceg oblika:
		// public Thread (String imeNiti)
	}
		public void run() {
			for (int i=1; i<=10; i++) {
				System.out.println(getName());
				
			}
		
				
	}
	
}
