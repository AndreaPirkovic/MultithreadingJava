package pirkovic.andrea;

public class Main {
	public static void main(String[] args) { 
	A a= new A();
	 B b= new B();
	 
	
	  a.setPriority(Thread.MAX_PRIORITY);
	 b.setPriority(Thread.MIN_PRIORITY);
	 a.start();
	 b.start();
	 System.out.println("Kraj glavne niti.");
	 
	 // Kada odredjenoj niti zelite da dodate prioritet 
	 //prilikom izvrsavanja pozovite metodu setPriority
	 //koja je clan klase Thread
	 	 // void setPriority(nivo)
	 	
	 	// Parametrom "nivo" zadajete nivo prioriteta niti za koju je metoda pozvana
	 // vrednost mora biti u opsegu izmedju min_priority i max_priority
	// min priority je 1 a max je 10
	 // podrazumevana tj default vrednost je 5, a moze se zadati preko norm_priority

	
	 
}}
