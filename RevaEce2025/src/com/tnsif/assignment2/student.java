package com.tnsif.assignment2;

public class student {
	    student() {
	        System.out.println("Student object is created");
	    }
	}
class Commission {
    String name, address, phone;
    double salesAmount, commission;

    // Method to accept sales employee details
    void acceptDetails(String name, String address, String phone, double salesAmount) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.salesAmount = salesAmount;
        calculateCommission();
    }

    // Method to calculate commission
    void calculateCommission() {
        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000 && salesAmount < 100000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000 && salesAmount < 50000) {
            commission = salesAmount * 0.03;
        } else {
            commission = 0;
        }
    }

    // Method to print commission details
    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Commission: " + commission);
    }
}
