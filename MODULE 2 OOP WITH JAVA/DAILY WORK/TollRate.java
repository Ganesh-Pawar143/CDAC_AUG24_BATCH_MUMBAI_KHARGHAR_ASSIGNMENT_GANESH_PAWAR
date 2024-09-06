package org.example;

import java.util.Scanner;

class TollBoothRevenueManager {
	Scanner sc = new Scanner(System.in);
	private float carRate;
	private float truckRate;
	private float mCycleRate;
	private int carCount;
	private int truckCount;
	private int mCycleCount;

	// acceptRecord, setTollRates, calculateRevenue & printRecord

	public void acceptRecord() {
		System.out.print("Enter Car Count	:");
		this.carCount = sc.nextInt();
		System.out.print("Enter Truck Count	:");
		this.truckCount = sc.nextInt();
		System.out.print("Enter MotorCycle Count	:");
		this.mCycleCount = sc.nextInt();

	}

	public void setTollRates() {

		System.out.print("Enter Car Rate	:");
		this.carRate = sc.nextFloat();
		System.out.print("Enter Truck Rate	:");
		this.truckRate = sc.nextFloat();
		System.out.print("Enter MotorCycle Rate	:");
		this.mCycleRate = sc.nextFloat();

	}

	public float calculateRevenue() {

		float totalRevenue = ((carCount * carRate) + (truckCount * truckRate) + (mCycleCount * mCycleRate));
		return totalRevenue;

	}

	public void printRecord() {

		System.out.println("Total Count of Vehicle	:" + (carCount + truckCount + mCycleCount));

		float totalRev = calculateRevenue();

		System.out.println("Total Revenue	:" + totalRev);

	}

}

public class TollRate {

	public static void main(String[] args) {

		TollBoothRevenueManager tbm = new TollBoothRevenueManager();
		tbm.setTollRates();

		tbm.acceptRecord();

		tbm.printRecord();

	}

}
