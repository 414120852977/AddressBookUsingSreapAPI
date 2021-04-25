package com.addressbook;

import java.util.*;
import java.util.stream.Collectors;

/**
 * created adrressbook class to do operations on addressbook such as adding , editing,deleting ,searching ,sorting by using stream api
 */
public class AddressBook {
    List<Contact> list = new ArrayList<>();
    Contact person = new Contact();
    Scanner scanner = new Scanner(System.in);
    Contact person1 = new Contact("ashok", "mane", "jalna", "maharashtra", "aurangabad", "ash@gmail.com", 4544, 454);

    //Contact person = new Contact();

    /**
     * created method to adding contacts user choice how many contacts he want to add in addressbook
     */
    public void addContact() {
        System.out.println("enter a number to how many contacts you have to add");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            //   Contact person = new Contact("ash", "njjd", "njebd", "ehfe", "eddej", "sduh", 5454, 5454);

            Contact person = new Contact();
            System.out.println("you can countinue");
            System.out.println("enter your first name");
            String firstName = scanner.next();
            person.setFirstName(firstName);
            System.out.println("enter your last name");
            String lastName = scanner.next();
            person.setLastName(lastName);
            System.out.println("enter your address :");
            String address = scanner.next();
            person.setAddress(address);
            System.out.println("enter your state name");
            String state = scanner.next();
            person.setState(state);
            System.out.println("enter your city :");
            String city = scanner.next();
            person.setCity(city);
            System.out.println("enter your email");
            String email = scanner.next();
            person.setEmail(email);
            System.out.println("enter your zip :");
            int zip = scanner.nextInt();
            person.setZip(zip);
            System.out.println("enter your contact no");
            int mobile = scanner.nextInt();
            person.setPhoneNo(mobile);
            list.add(person);
            list.add(person1);

        }
        System.out.println(list);
    }

    /**
     * @edit method gives us to edit person data user can also edit his data by using his/she name
     */
    public void edit() {
        List list = this.list;
        System.out.println("enter a name whose data will you have to edit");
        Scanner scanner = new Scanner(System.in);
        String fname = scanner.nextLine();

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            Contact person = (Contact) iterator.next();

            if (fname.equals(person.getFirstName())) {
                System.out.println("you can edit");
                System.out.println("1/edit first name," +
                        "2/edit lastname," +
                        "3/edit phone no," +
                        "4/edit city," +
                        "5/edit zip," +
                        "6/edit state," +
                        "7/edit phone no");
                System.out.println("enter a number to edit details");
                int number = scanner.nextInt();

                switch (number) {

                    case 1:
                        System.out.println("please suggest firstName");
                        person.firstName = scanner.next();
                        System.out.println("implemented firstName: " + person.firstName);
                        break;
                    case 2:
                        System.out.println("please suggest your lastname");
                        person.lastName = scanner.next();
                        System.out.println("implemented lastname: " + person.lastName);
                        break;
                    case 3:
                        System.out.println("please suggest your Phone Number");
                        person.phoneNo = scanner.nextInt();
                        System.out.println("implemented PhoneNo: " + person.phoneNo);
                        break;
                    case 4:
                        System.out.println("please suggest your City");
                        person.city = scanner.next();
                        System.out.println("implemented city: " + person.city);
                        break;
                    case 5:
                        System.out.println("please suggest your Zip");
                        person.zip = scanner.nextInt();
                        System.out.println("implemented zip: " + person.zip);
                        break;
                    case 6:
                        System.out.println("please suggest your State");
                        person.state = scanner.next();
                        System.out.println("implemented state: " + person.state);
                        break;
                    case 7:
                        System.out.println("please suggest your address");
                        person.address = scanner.next();
                        System.out.println("implemented address is: " + person.address);

                        list.add(person);
                }
                System.out.println(list);
            } else {
                System.out.println("person not found");
            }

        }

    }

    /**
     * @delete method is used to deleting present person from addressbook. user can do deleting his data on his own restriction
     */
    public void delete() {
        System.out.println("enter your name to delete data of name:");
        String fname = scanner.next();
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            Contact person = (Contact) iter.next();

            if (fname.equals(person.getFirstName())) {
                list.remove(person);
            }
        }

        System.out.println(list);
    }

    public void createAddressBook() {

    }

    /**
     * @addMultiplePerson method used to create addressbook into addressbook and admin created following addressbook then user also pressered
     * use of  admin addresbooks
     */
    public void addMultiplePerson() {
        System.out.println("Here some address book you can create it in your data:--");
        Set<String> set = new HashSet();
        set.add("Aurangabad");
        set.add("mumbai");
        set.add("pune");
        System.out.println(set);

        System.out.println("1./t,For Aurangabad,2./t For Mumbai,3./t For Pune");
        System.out.println("enter a number:--");
        int number1 = scanner.nextInt();
        switch (number1) {
            case 1:
                System.out.println("you will be added your detalis for Aurangabad:--");

                System.out.println("enter a number to how many contacts you have to add");
                Scanner scanner = new Scanner(System.in);
                int number = scanner.nextInt();

                for (int i = 1; i <= number; i++) {
                    //   Contact person = new Contact("ash", "njjd", "njebd", "ehfe", "eddej", "sduh", 5454, 5454);

                    Contact person = new Contact();
                    System.out.println("you can countinue");
                    System.out.println("enter your first name");
                    String firstName = scanner.next();
                    person.setFirstName(firstName);
                    System.out.println("enter your last name");
                    String lastName = scanner.next();
                    person.setLastName(lastName);
                    System.out.println("enter your address :");
                    String address = scanner.next();
                    person.setAddress(address);
                    System.out.println("enter your state name");
                    String state = scanner.next();
                    person.setState(state);
                    System.out.println("enter your city :");
                    String city = scanner.next();
                    person.setCity(city);
                    System.out.println("enter your email");
                    String email = scanner.next();
                    person.setEmail(email);
                    System.out.println("enter your zip :");
                    int zip = scanner.nextInt();
                    person.setZip(zip);
                    System.out.println("enter your contact no");
                    int mobile = scanner.nextInt();
                    person.setPhoneNo(mobile);
                    list.add(person);
                }
                break;
            case 2:
                System.out.println("you will be added your detalis for Mumbai:--");

                System.out.println("enter a number to how many contacts you have to add");
                Scanner scanner1 = new Scanner(System.in);
                int number2 = scanner1.nextInt();

                for (int i = 1; i <= number2; i++) {
                    //   Contact person = new Contact("ash", "njjd", "njebd", "ehfe", "eddej", "sduh", 5454, 5454);

                    Contact person = new Contact();
                    System.out.println("you can countinue");
                    System.out.println("enter your first name");
                    String firstName = scanner1.next();
                    person.setFirstName(firstName);
                    System.out.println("enter your last name");
                    String lastName = scanner1.next();
                    person.setLastName(lastName);
                    System.out.println("enter your address :");
                    String address = scanner1.next();
                    person.setAddress(address);
                    System.out.println("enter your state name");
                    String state = scanner1.next();
                    person.setState(state);
                    System.out.println("enter your city :");
                    String city = scanner1.next();
                    person.setCity(city);
                    System.out.println("enter your email");
                    String email = scanner1.next();
                    person.setEmail(email);
                    System.out.println("enter your zip :");
                    int zip = scanner1.nextInt();
                    person.setZip(zip);
                    System.out.println("enter your contact no");
                    int mobile = scanner1.nextInt();
                    person.setPhoneNo(mobile);
                    list.add(person);
                }
                break;
            case 3:

                System.out.println("you will be added your detalis for Pune:--");

                System.out.println("enter a number to how many contacts you have to add");
                Scanner scanner2 = new Scanner(System.in);
                int number3 = scanner2.nextInt();

                for (int i = 1; i <= number3; i++) {
                    //   Contact person = new Contact("ash", "njjd", "njebd", "ehfe", "eddej", "sduh", 5454, 5454);

                    Contact person = new Contact();
                    System.out.println("you can countinue");
                    System.out.println("enter your first name");
                    String firstName = scanner2.next();
                    person.setFirstName(firstName);
                    System.out.println("enter your last name");
                    String lastName = scanner2.next();
                    person.setLastName(lastName);
                    System.out.println("enter your address :");
                    String address = scanner2.next();
                    person.setAddress(address);
                    System.out.println("enter your state name");
                    String state = scanner2.next();
                    person.setState(state);
                    System.out.println("enter your city :");
                    String city = scanner2.next();
                    person.setCity(city);
                    System.out.println("enter your email");
                    String email = scanner2.next();
                    person.setEmail(email);
                    System.out.println("enter your zip :");
                    int zip = scanner2.nextInt();
                    person.setZip(zip);
                    System.out.println("enter your contact no");
                    int mobile = scanner2.nextInt();
                    person.setPhoneNo(mobile);
                    list.add(person);
                }
        }
        System.out.println(list);
    }

    /**
     * user can also creating his own addressbook with gives his specific name to addressbook
     */
    public void addMultipleBook() {
        Set set = new TreeSet();
        System.out.println(" yours choice how many addressbook you want to create it:--");
        int number = scanner.nextInt();

        for (int index = 1; index <= number; index++) {
            System.out.println("give name to your dictionary:--");
            String name = scanner.next();
            set.add(name);
        }
        System.out.println(set);
    }

    /**
     * user can do serch data by using name of a person
     */
    public void searchByName() {
        System.out.println("enter a name to search");
        Scanner sc = new Scanner(System.in);
        String fName = sc.nextLine();
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Contact person = (Contact) itr.next();
            if (fName.equals(person.getFirstName())) {
                List streamlist = list.stream().
                        filter(n -> n.getFirstName().
                                contains(fName)).
                        collect(Collectors.toList());
                System.out.println(streamlist);
            }
        }
    }

    /**
     * if user want to know who is from my city then he will also check in addressbook
     */
    public void searchByCity() {
        System.out.println("enter a name of city to collect person data");
        Scanner sc = new Scanner(System.in);
        String city = sc.next();
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Contact person = (Contact) itr.next();
            if (city.equals(person.getCity())) {
                List streamlist = list.stream().filter(n -> n.getCity().contains(city)).collect(Collectors.toList());
                System.out.println(streamlist);
            }
        }
    }

    /**
     * if user know person email id then he will also check by email id whos there with this email id
     */
    public void searchByEmail() {
        System.out.println("enter email to get that person details:");
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Contact person = (Contact) itr.next();
            if (email.equals(person.getEmail())) {
                List streamList = list.stream().filter(n -> n.getEmail().contains(email)).collect(Collectors.toList());
                System.out.println(streamList);
            }

        }
    }

    /**
     * user can also check who is from my state in addressbook
     */
    public void searchByState() {
        System.out.println("enter a name of state to fetch person data fro state :--");
        String state = scanner.next();

        Iterator it = list.iterator();
        while (it.hasNext()) {
            Contact person = (Contact) it.next();
            if (state.equals(person.getState())) {
                List stream = list.stream().filter(n -> n.getCity().contains(state)).collect(Collectors.toList());
                System.out.println(stream);
            }
        }
    }

    /**
     * if user will hve been any help fro his city then he will check in addressbook who is from my city then he will find his
     * phone no.
     */
    public void getContactByCity() {
        System.out.println("enter a name of city to fetch contact details:--");
        String city = scanner.next();

        Iterator itrs = list.iterator();
        while (itrs.hasNext()) {
            Contact person = (Contact) itrs.next();

            if (city.equals(person.getCity())) {
                List streamList = list.stream().map(n -> n.getPhoneNo()).collect(Collectors.toList());
                System.out.println(streamList);
            }
        }
    }

    public void menuChoice() {
        AddressBook addressBook = new AddressBook();

        System.out.println("enter a number to what you have to do in addressbook");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                addressBook.addContact();
                menuChoice();
                break;
            case 2:
                addressBook.edit();
                menuChoice();
                break;
            case 3:
                addressBook.delete();
                menuChoice();
            case 4:
                addressBook.addMultiplePerson();
                menuChoice();
                break;
            case 5:
                addressBook.addMultipleBook();
                menuChoice();
                break;
            case 6:
                addressBook.searchByName();
                menuChoice();
                break;
            case 7:
                addressBook.searchByCity();
                menuChoice();
                break;
            case 8:
                addressBook.searchByEmail();
                menuChoice();
                break;
            case 9:
                addressBook.searchByState();
                menuChoice();
                break;
            case 10:
                addressBook.getContactByCity();
                menuChoice();
                break;
        }
    }
    public void menu() {
        System.out.println("1.to add contact into addressbook:");
        System.out.println("2.to add edit your contact details:");
        System.out.println("3.to  delete your contact details:");
        System.out.println("4.to add adding multiple persons:");
        System.out.println("5.to adding multiple addressBook :");
        System.out.println("6.to search by name person details:");
        System.out.println("7.to search by city person details:");
        System.out.println("8.to search by email person details:");
        System.out.println("9. to to search by state person details::");
        System.out.println("10. to get contact number from city :");
    }
}