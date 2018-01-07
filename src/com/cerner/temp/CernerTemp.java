/**
 * 
 */
package com.cerner.temp;

import java.util.Scanner;

/**
 * @author ArunMannuru
 *
 */
public class CernerTemp extends Temparature{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		CernerTemp cernerTemp = new CernerTemp();
		Temparature bodyTemp = cernerTemp;
		
		String fever = null;
		
		System.out.println("Enter First Name of Patient:");
		cernerTemp.setFName(sc.nextLine());
		System.out.println("Enter Last Name of Patient");
		cernerTemp.setLName(sc.nextLine());
		System.out.println("Enter the body part where it was recorded:\n1.Mouth\n2.Armpit\n3.EAR");
		switch(sc.nextInt()){
		case 1:cernerTemp.setBodyPart(Part.MOUTH);
				break;
		case 2:cernerTemp.setBodyPart(Part.ARMPIT);
				break;
		default:cernerTemp.setBodyPart(Part.EAR);
				break;
		}
		System.out.println("Temparature Recorded at:"+cernerTemp.getBodyPart());
		System.out.println("Enter the temparature recorded");
		cernerTemp.setTemparature(sc.nextFloat());
		if(cernerTemp.isFever()){
			System.out.println(cernerTemp.getFName()+"has fever");
		}else{
			System.out.println(cernerTemp.getFName()+" "+"has no fever");
		}
	}

}
