package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Service mobileService = new Service();
        //mobileService.addCustomer("9879397980");
        //mobileService.addCustomer("9879397981");
        //mobileService.addCustomer("9879397982");
        //mobileService.addCustomer("9879397983");
        //mobileService.addCustomer("9879397984");
        //mobileService.addCustomer("9879397985");
        //mobileService.addCustomer("9879397986");
        //mobileService.addCustomer("9879397987");
        //mobileService.addCustomer("9879397988");
        mobileService.addCustomer("9879397989");
        mobileService.addCustomer("9879397990");
        //mobileService.addCustomer("9879397991");
        //mobileService.addCustomer("9879397992");
        //mobileService.addCustomer("9879397993");
        //mobileService.addCustomer("9879397994");
        ArrayList<Bill> bills = mobileService.genratBill(mobileService.subscribers,330,"1");
        for(int i=7;i<30;i++){
            mobileService.notify_customers(bills,i);
        }
    }
}
