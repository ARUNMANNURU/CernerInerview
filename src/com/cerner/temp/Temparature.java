/**
 * 
 */
package com.cerner.temp;

/**
 * @author ArunMannuru
 *
 */

/*
 * Design Temperature class, variation in degree +/- 1 when temperature taken from mouth ,armpit etc . 
 * Write function isFever() which determines patient has fever or not. 
 * 
 * 
 */

public class Temparature {

	private String fName;
	private String lName;
	private Part bodyPart;
	private float temparature;
	
	public float getTemparature(){
		return temparature;
	}
	public void setTemparature(float temparature){
		this.temparature = temparature;
	}
	public String getFName(){
		return fName;
	}
	public void setFName(String fName){
		this.fName = fName;
	}
	public String getLName(){
		return lName;
	}
	public void setLName(String lName){
		this.lName = lName;
	}
	public Part getBodyPart(){
		return bodyPart;
	}
	public void setBodyPart(Part bodyPart){
		this.bodyPart = bodyPart;
	}
	public double getTemperatureInFahrenheit() {
        return ( temparature * (9/5.0) + 32 );
    }
	public boolean isFever(){
		if(temparature >= 100){
			return true;
		}
		return false;
	}
	
}
