
public class B implements A{
	
	
	
	public static void main(String[] args) {
		B b=new B();
		b.add();
		b.div();
	}

	@Override
	public void add() {
		System.out.println("jevla ka");
		
	}

	@Override
	public void div() {
		System.out.println("ho jevlo");
		
	}

	

	
	
}
