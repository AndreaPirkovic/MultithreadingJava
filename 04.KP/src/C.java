
public class C extends Thread{
	
	C(String s){
		super(s); 
	}
	public void run() {
		System.out.println(getName());
	
	}
}

