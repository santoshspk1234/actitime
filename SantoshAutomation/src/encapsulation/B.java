package encapsulation;

public class B {

	public static void main(String[] args) {
		A a1=new A();
		
		int x=a1.getValue();
		System.out.println(x);
		
		a1.setValue(5);
		System.out.println(a1.getValue());
	}
}
