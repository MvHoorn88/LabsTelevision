package labs3;


public class TelevisionTest {
/*
 * Class with main method,where the program STARTS
 */
	public static void main(String[] args) {
	// INSTANTIATE two Televisions
		Television tv01 = new Television();
		Television tv02 = new Television();
		
    // assign value to the brand using direct acces
		tv01.brand = "Hitachi";
		System.out.println("Television: brand=" + tv01.getBrand() + ", volume=" +tv01.getVolume());
		System.out.println("television: brand=" + tv02.getBrand() + ", volume=" + tv02.getVolume());
	}

}
