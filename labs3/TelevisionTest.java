package labs3;


public class TelevisionTest {
/*
 * Class with main method,where the program STARTS
 */
	public static void main(String[] args) {
		
	// INSTANTIATE two Televisions
		Television tv01 = new Television();
		Television tv02 = new Television();
		
    // assign value to the brands and volumes using setter methods
		tv01.setBrand("Hitachi");
		tv01.setVolume(15);
		
		tv02.setBrand("Sony");
		tv02.setVolume(40);
		
		// displays the values using the toString() method
		System.out.println(tv01);   // implicit toString call
		System.out.println(tv02.toString()); //explicit toString call
	}

}
