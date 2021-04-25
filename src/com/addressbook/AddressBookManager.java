package com.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookManager {

    public static void main(String[] args) {
        List<Contact> list = new ArrayList();
        Contact person = new Contact("ashok","mane","jalna","maharashtra","aurangabad","ash@gmail.com",4544,454);
        list.add(person);
        System.out.println(list);
    /**
     * here in main method switch case overhere beacause users choile he want to operation or exit from our addressbook system
     */
        AddressBook addressBook = new AddressBook();
        System.out.println("1./go inside addressBook and do operations,2./exit from addressBook");
        System.out.println("enter a number :--");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch(num) {
            case 1:
                addressBook.addContact();
                addressBook.edit();
                addressBook.delete();
                addressBook.addMultiplePerson();
                addressBook.addMultipleBook();
                addressBook.searchByName();
                addressBook.searchByCity();
                addressBook.searchByEmail();
                addressBook.searchByState();
                addressBook.getContactByCity();

                case 2:
                System.out.println("thanks for joining us ! have a nice day");
        }
        System.out.println("****** Created and developed by Ashok Mane *******");
    }
}
