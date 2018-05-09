package labs3;


public class TelevisionTest {
/*
 * Class with main method,where the program STARTS
 */
	public static void main(String[] args) {
		
	// INSTANTIATE a default Television
		Television tv01 = new Television();
	// instantiate a Television with specified values
		Television tv02 = new Television("Zenith", 17);
		
    // assign value to the brands and volumes using setter methods
		
		// displays the values using the toString() method
		System.out.println(tv01); 
		System.out.println(tv02); 
	}

}
