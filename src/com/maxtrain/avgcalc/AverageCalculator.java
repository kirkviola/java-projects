package com.maxtrain.avgcalc;



public class AverageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double total = 0.0;
		var counter = 0;
		
		for(double num = 1; num <= 75; num++) {
			if(num % 3 == 0 || num % 7 == 0) {
				total += num; counter++;
			}
		}
			var avg = total / counter;
		
			System.out.println(avg);
	}
		
}


