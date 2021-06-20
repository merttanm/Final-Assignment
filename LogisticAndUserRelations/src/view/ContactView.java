/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import relationssystem.model.Car;
import relationssystem.model.Contact;

/**
 *
 * @author MERT
 */
public class ContactView {
   
    public void printContactDetailView(Contact contact){
        System.out.println("REZEVASYON BİLGİLERİ *************");
        System.out.println("REZERVASYON YAPAN MÜŞTERİ BİLGİLERİ *****");
        System.out.println("       ADI : " + contact.getCustomer().getCustomerName());
        System.out.println("    SOYADI : " + contact.getCustomer().getCustomerSurname());
        System.out.println("    TEL NO : " + contact.getCustomer().getPhoneNumber());
        
        System.out.println("REZERV EDİLEN ARAÇ BİLGİLERİ ********");
        for(Car car: contact.getCarList())
        {
            System.out.println("    ARAÇ MARKA   :"  + car.getName());
            System.out.println("    ARAÇ MODEL   :"  + car.getModel());
            System.out.println("    ARAÇ RENK    :"  + car.getColor());
            System.out.println("    ARAÇ PLAKA   :"  +car.getPlate());
            System.out.println("    ARAÇ DURUM   :"  + (car.isCarReserved()==true ? "ARAÇ REZERVELİ. " : "ARAÇ REZERVİ BİTTİ"));
            System.out.println("    REZERV TUTAR :" + car.calcRentPrice());
        }
    }
}
    

