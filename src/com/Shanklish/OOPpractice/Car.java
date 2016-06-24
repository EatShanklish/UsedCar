package com.Shanklish.OOPpractice;


public class Car
    {
	private String make;
	private String model;
	private int year;
	private double price;
	
	public Car(String m, String mo, int y, double p)
	{
	    make = m;
	    model = mo;
	    year = y;
	    price = p;
	}

	
	public String getMake()
	{
	    return make;
	}

	
	public void setMake( String make )
	{
	    this.make = make;
	}

	
	public String getModel()
	{
	    return model;
	}

	
	public void setModel( String model )
	{
	    this.model = model;
	}

	
	public int getYear()
	{
	    return year;
	}

	
	public void setYear( int year )
	{
	    this.year = year;
	}

	
	public double getPrice()
	{
	    return price;
	}

	
	public void setPrice( double price )
	{
	    this.price = price;
	}
    }
