package main;

import CandyMachine.CandyMachine;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CandyMachine cm = new CandyMachine();
		cm.setCount(100);
		

		cm.insertQuarter();
		cm.insertQuarter();
		cm.insertQuarter();
		
		cm.turnCrank();
		cm.dispense();
		
	}

}
