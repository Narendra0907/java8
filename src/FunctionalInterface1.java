
@FunctionalInterface
public interface FunctionalInterface1{

	void m1();
	
	
	//static---->utils methods 
		static void  m2() {
			System.out.println("static method");
		}
		
		//default---> new features 
		default void m3() {
			System.out.println("default method");
		}
	
	
	
}
