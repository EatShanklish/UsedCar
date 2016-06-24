package com.Shanklish.OOPpractice;

import java.util.ArrayList;

public class CarDealership 
{
	public static void main(String[] args) 
	{
		ArrayList<Car> carList = new ArrayList<Car>();
		
		carList.add(new Car ("Ford", "Explorer", 2016, 27999.99));
		carList.add(new Car ("Chevy", "Tahoe", 2016, 31999.99));
		carList.add(new UsedCar("Pontiac", "Aztek", 2003, 2999.99, 235000));
		carList.add(new UsedCar("Saturn", "Vue", 2001, 1999.99, 150000));
		
		carList.get(1).setMake("Fiat");
		carList.get(1).setModel("Spyder");
		carList.get(1).setYear(2017);
		carList.get(1).setPrice(29999.50);
		
		for (Car c: carList) 
		    {
			if (c instanceof UsedCar)
			    {
				System.out.println("USED: " + c.getMake() + "\t\t" + c.getModel() + "\t\t" + c.getYear() + "\t\t($" + c.getPrice() +")" +"\t\t" + ((UsedCar)c).getMiles());
				System.out.println();
			    }
				
			else 
			System.out.println("NEW: " + c.getMake() + "\t\t" + c.getModel() + "\t\t" + c.getYear() + "\t\t($" + c.getPrice() +")");
			
			
		}
	}
}
