package pirkovic.andrea;

public class A extends Thread{
  public void run() {
	  
	  int i=1;
	  while (i<=10) {
		  System.out.println("i:" + i);
		  // sleep(vrednostUMilisekundama)
		  try {
			Thread.sleep(1000); //privremeno suspendovanje resursa ovoj niti na 1000 milisek
			// za to vreme druga nit moze da pristupi izvrsavanju i doci ce do exceptiona
			// zato je neophodan try catch blok
			// argument metode sleep je interval  cekanja u milisekundama
		} catch (InterruptedException e) {
			System.out.println("Nit je prekinuta.");
		}
		  i++;
		  
	  }
  }
}
