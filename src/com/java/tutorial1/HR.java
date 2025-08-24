package com.java.tutorial1;

public class HR {

	public boolean isEmployeeAllowed(int workDay, String dressType, boolean isIDPresent) {
		
		boolean temp = true;
		if(workDay > 5) {
			System.out.println("Workday greater than 5 not allowed");
			temp = false;
		}else {
			if(workDay==5) {
				if (dressType == "Casual") {
					if (isIDPresent == true) {
//						return true;
						temp = true;
					}else {
						return false;
					}
				}else if (dressType == "Formal") {
					if (isIDPresent == true) {
//						return true;
						temp = true;
					}else {
						return false;
					}
				}else {
					return false;
				}
			}else if(workDay<5) {
				if (dressType == "Casual") {
					return false;
				}else if (dressType == "Formal") {
					if (isIDPresent == true) {
//					return true;
						temp = true;
					}else {
						return false;
					}
				}else {
					return false;
				}
				
			}
		}
		return temp;
//		return false;
	}

}
