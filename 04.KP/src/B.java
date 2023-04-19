
public class B extends Thread{
	
	B(String s){
		super(s); 
	}
	public void run() {
		System.out.println(getName());
	
	}
}

