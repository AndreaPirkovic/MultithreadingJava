//Kreiramo klase A,B,C.
//Neka te klase nasledjuju klasu Thread
//(Za domaci Runnable)
//Implementirati metode run()
//U pokretackoj klasi Main kreirati objekte tih klasa i pokrenuti threadove tih klasa
public class A extends Thread{
	A(String s){
		super(s); 
	}
			public void run() {
				System.out.println(getName());
			
			}
}
