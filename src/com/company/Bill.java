package com.company;

public class Bill {
    Customer customer;
    int amount;
    String billGenerationDate;
    public Bill(Customer customer, int amount,String date) {
        this.customer = customer;
        this.amount = amount;
        this.billGenerationDate = date;
    }

    public Customer getCustomer() {
        return customer;
    }
    public String getCustomerPhoneNumber(){
        return this.customer.phone_number;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
