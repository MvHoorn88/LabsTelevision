package labs3;

/*
 * CLASS DEFINITION
 */
public class Television {

	// INSTANCE VARIABLES
	private String brand; // brand name (with initializer)
	private int volume; // volume (with no initializer)
	
	// CONSTRUCTORS
	Television(){
		// call "detailed"constructor with default values
		this("RCA", 10);
	}
	Television(String brandIn){
		// call "detailed" constructor with supplied brand and default volume
		this(brandIn, 10);
	}
	Television(int volumeIn){
		// call "detailed"constructor with default brand and supplied volume
		this("RCA", volumeIn);
	}
	Television(String brandIn, int volumeIn){
		// call setter methods to actually set the data
		this.setBrand(brandIn);
		this.setVolume(volumeIn);
	}

	// ACCESSOR METHODS
	public void setBrand(String brandIn) {   //SETTER
		brand = brandIn;
	}

	public String getBrand() {               // GETTER
		return brand;
	}

	public void setVolume(int volumeIn) {   // SETTER
		volume = volumeIn;
	}

	public int getVolume() {                // GETTER
		return volume;
	}

	// returns a string representation of this class instance
	public String toString() {
		return "Television: brand=" + this.getBrand() + ", volume=" + this.getVolume();
	}
}
