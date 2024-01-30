package vector;

public class Start {

	public static void main(String[] args) {

		
		MiVector uno = new MiVector(10);
		
		uno.add(1);
		uno.add(2);
		uno.add(3);
		uno.add(4);
		uno.add(5);
		
		uno.del(1);
		uno.del(2);
		uno.del(3);
			
		
		System.out.println(uno);
	}

}
