package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Customer {
    String phone_number;
    boolean paid;
    int NO_days_notification_recieved;
    boolean service_blocked;
    int bill_due;
    boolean isPrivateNumber;
    public Customer(String phone_number) {
        this.phone_number = phone_number;
        this.paid = false;
        this.service_blocked = false;
        this.NO_days_notification_recieved = 0;
        this.bill_due = 0;
        this.isPrivateNumber = false;
    }

    public String getPhone_number() {
        return phone_number;
    }
    public boolean getservice_blocked(){
        return this.service_blocked;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
    void onrecieveNotification(int day){
        if(this.service_blocked==true){
            System.out.println(this.phone_number+" Your service has been blocked!!!!");
            return;
        }
        if(day>=16){
            if(this.paid==false){
                System.out.println("Your service has been blocked");
                this.service_blocked = true;
            }
            return;
        }
        System.out.println(this.phone_number+" Your bill of "+this.bill_due+" is due. Your service will expire in "+(15-day)+" days");
        this.NO_days_notification_recieved = day;
        System.out.println("To pay bill enter 1 or enter 0");
        Scanner scanner = new Scanner(System.in);
        int billpay = scanner.nextInt();
        if(billpay==1){
            payBill();
        }

    }
    public void payBill(){
        if(this.service_blocked==false){
            int amount = this.bill_due;
            //System.out.println(this.phone_number+" Your due amount is "+amount);
            System.out.println(this.phone_number+" paid bill of "+this.bill_due);
            this.paid = true;
        }//else{
           // System.out.println("!Your service has been blocked due to not paying this month's bill please contact nearest customer care!!!!");
        //}
    }
}
