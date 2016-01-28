package dojo;

import java.awt.Color;

public class Car
{
	Color color;
	Fuel fuel;
	String manufacturer;
	int maxspeed;
	double zeroToHundred;

	public Car(Color color, Fuel fuel, String manufacturer, int maxspeed, double zeroToHundred)
	{
		this.color = color;
		this.fuel = fuel;
		this.manufacturer = manufacturer;
		this.maxspeed = maxspeed;
		this.zeroToHundred = zeroToHundred;
	}

	public Color getColor()
	{
		return color;
	}

	public void setColor(Color color)
	{
		this.color = color;
	}

	public Fuel getFuel()
	{
		return fuel;
	}

	public void setFuel(Fuel fuel)
	{
		this.fuel = fuel;
	}

	public String getManufacturer()
	{
		return manufacturer;
	}

	public void setManufacturer(String manufacturer)
	{
		this.manufacturer = manufacturer;
	}

	public int getMaxspeed()
	{
		return maxspeed;
	}

	public void setMaxspeed(int maxspeed)
	{
		this.maxspeed = maxspeed;
	}

	public double getZeroToHundred()
	{
		return zeroToHundred;
	}

	public void setZeroToHundred(double zeroToHundred)
	{
		this.zeroToHundred = zeroToHundred;
	}

	public String colorToString(Color c)
	{
		return "r:" + color.getRed() + " g:" + color.getGreen() + " b:" + color.getBlue();
	}

	public String toString()
	{
		return colorToString(color) + "\n" + fuel + "\n" + manufacturer + "\n" + maxspeed + "\n" + zeroToHundred;
	}

	public static void main(String[] args)
	{
		Color color = Color.blue;
		Car car = new Car(color, Fuel.DIESEL, "Mercedes", 280, 7.8);
		System.out.println(car);
	}
}
