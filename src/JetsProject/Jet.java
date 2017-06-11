package JetsProject;

import java.text.DecimalFormat;

public class Jet {

	// create the blueprint for the jet

	public double getSpeedMach() {
		return speedMach;
	}

	public void setSpeedMach(double speedMach) {
		this.speedMach = speedMach;
	}

	// ****** instance variables ********
	private String model = "";
	private double speedMach = 0.00D;
	private int range = 0;
	private double price = 0.2d;
	// private int capacity = 0;
	// private String pilot = "";

	// ******* constructors go here *****
	Jet(String model, double speedMPH, int range, double price) {
		this.model = model;
		this.speedMach = ConvertToMach(speedMPH);
		this.range = range;
		this.price = price;

	}

	public Jet() {
		// TODO Auto-generated constructor stub
	}

	// ******** getters and setters ***********
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// to string for printing out data!
	@Override
	public String toString() {
		return "Jet model=" + model + ", speedMach=" + speedMach + ", range=" + range + ", price=" + price + "";
	}

	// ******** methods go here

	public double ConvertToMach(double speedInMPH){
				speedMach = speedInMPH * 0.00130332;
				DecimalFormat df = new DecimalFormat("#.00");
			    double formattedMach = Double.parseDouble(df.format(speedMach));
				return formattedMach;
	}

}
