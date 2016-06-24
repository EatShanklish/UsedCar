package com.Shanklish.OOPpractice;


public class UsedCar extends Car
    {	
	private int miles;

        public UsedCar( String m , String mo , int y , double p, int mi) 
        {
        	super(m, mo, mi, p);
        	miles = mi;	
        }

    
    public int getMiles()
    {
        return miles;
    }

    
    public void setMiles( int miles )
    {
        this.miles = miles;
    }
	
    }
