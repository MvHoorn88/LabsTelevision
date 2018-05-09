package labs3;

/*
 * CLASS DEFINITION
 */
public class Television {

	// INSTANCE VARIABLES
	private String brand; // brand name (with initializer)
	private int volume; // volume (with no initializer)

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
