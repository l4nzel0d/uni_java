package bikeproject;

public class Bike implements BikeParts {

	private String handleBars, frame, tyres, seatType;
	private int numGears;
	
	public Bike(){
	}//end constructor
	
	public Bike(String handleBars, String frame, String tyres, String seatType, int numGears) {
		this.handleBars = handleBars;
		this.frame = frame;
		this.tyres = tyres;
		this.seatType = seatType;
		this.numGears = numGears;
	}//end constructor

	@Override
	public void printDescription()
	{
		System.out.println("\n" + make + "\n"
				          + "This bike has " + this.handleBars + " handlebars on a " 
				          + this.frame + " frame with " + this.numGears + " gears."
				          + "\nIt has a " + this.seatType + " seat with " + this.tyres + " tyres.");
	}//end method printDescription

	@Override
	public String getHandleBars() {
		return this.handleBars;
	}

	@Override
	public String getFrame() {
		return this.frame;
	}

	@Override
	public String getTyres() {
		return this.tyres;
	}

	@Override
	public String getSeatType() {
		return this.seatType;
	}

	@Override
	public int getNumGears() {
		return this.numGears;
	}


	@Override
	public String getMake() {
		return make;
	}


	@Override
	public void setHandleBars(String newValue) {
		this.handleBars = newValue;
	}

	@Override
	public void setFrame(String newValue) {
		this.frame = newValue;
	}

	@Override
	public void setTyres(String newValue) {
		this.tyres = newValue;
	}

	@Override
	public void setSeatType(String newValue) {
		this.seatType = newValue;
	}

	@Override
	public void setNumGears(int newValue) {
		this.numGears = newValue;
	}
}//end class Bike
	
	

