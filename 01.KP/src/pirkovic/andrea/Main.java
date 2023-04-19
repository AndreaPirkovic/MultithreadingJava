package pirkovic.andrea;

public class Main {

	public static void main(String[] args) {
		//prilikom pokretanja Java programa jedna programska nit
		//odmah pocinje da se izvrsava.
		//To je glavna ili inicijalna nit.
		//upravljanjem glavnom niti radi se preko objekta
		//tipa Thread pozivom metode currentThread() klase Thread
		
		Thread t = Thread.currentThread();
		
		System.out.println("Trenutna nit: " + t);
		
		System.out.println("Naziv niti:" + Thread.currentThread().getName());
		// getName() - vraca ime niti
		
		//getPriority() - vraca prioritet niti
		System.out.println("Prioritet niti:" + Thread.currentThread().getPriority());
		
		
		
		
		//[ime niti, prioritet, ime grupe kojoj pripada nit]
		// podrazumevano ime glavne niti je main. Njen prioritet je 5 po defaultu, sto je 
		//takodje podrazumevana vrednost. 
		//main na trecem mestu u zagradi je ime grupe niti kojoj ta nit pripada
		//grupa niti je struktura podataka koja upravlja stanjem kolekcije niti kao celinom.
		
	}

}
