
public class SbiBanking  implements Banking{

	@Override
	public void m1() {
		System.out.println("abstract method");
		
	}
	
	@Override
	public void m3() {
	
		Banking.super.m3();
	}
	
	public static void main(String[] args) {
		Banking.m2();
	}
	
	

	

}
