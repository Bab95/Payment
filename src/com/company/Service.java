package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Service {

    ArrayList<Customer> subscribers = new ArrayList<Customer>();
    public void addCustomer(String phone_number){
        Customer customer = new Customer(phone_number);
        subscribers.add(customer);
        System.out.println("Customer subscriber "+phone_number);
    }
    ArrayList<Customer> notpaid(ArrayList<Customer> subscribers){
        ArrayList<Customer> customers_not_paid = new ArrayList<Customer>();
        for(Customer customer:subscribers){
            if(!customer.isPaid()){
                customers_not_paid.add(customer);
            }
        }
        return customers_not_paid;
    }

    ArrayList<Bill> genratBill(ArrayList<Customer> customers,int amount,String date){
        ArrayList<Bill> bills = new ArrayList<Bill>();
        for(Customer customer:customers){
            if(customer.isPrivateNumber==true){
                amount = amount*2+450;
            }
            Bill bill = new Bill(customer,amount,date);
            customer.bill_due = amount;
            bills.add(bill);
            //System.out.println(customer.phone_number+" Bill generated "+amount);
        }
        return bills;
    }
    public void notify_customers(ArrayList<Bill> bills,int day){
        System.out.println(day+" :");
        for(Bill bill:bills){
            Customer customer = bill.getCustomer();
            if(customer.isPaid()==false){
                //System.out.println(customer.bill_due+" bill due..");
                customer.onrecieveNotification(day);
            }
        }
    }
}
