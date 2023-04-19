package pirkovic.andrea;

public class A extends Thread{
	public void run() {
		for (int i=1; i<=15; i++) {
			System.out.println("Nit A:" + i);
		}
		System.out.println("Kraj izvrsavanja niti A.");
		}
	}

