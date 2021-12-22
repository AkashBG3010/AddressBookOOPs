package com.bridgelabz;

import java.util.Scanner;

public class PersonList {
		
		static Scanner sc = new Scanner(System.in);
		static String firstName,lastName,address,state,email;
		static int zip;
		static long phoneNumber;
	    static ContactList [] personDetails = new ContactList[10];

		public static void main(String args[]) {
			
			ContactList person1 = new ContactList("Pavan","Kumar","Balebail","Karnataka",577432,123456789,"pavankaumar@gmail.com");
			ContactList person2 = new ContactList("Shiva","Kumar","Kushavati","Karnataka",577432,123456789,"shivukumar@gmail.com");
			ContactList person3 = new ContactList("Sameep","Pai","Bettmakki","Karnataka",577432,123456789,"sameeppai@gmail.com");
		    personDetails[0]=person1;
		    personDetails[1]=person2;
		    personDetails[2]=person3;
		    System.out.println("Created contact list is");
		    for(int i = 0; i < 3;i++) {
			   System.out.println(personDetails[i]);
		    }
		    operations();
		}
		public static void operations() {
			int j = 0;
		    System.out.println("Enter your choice");
		    System.out.println("1)Add contact");
		    System.out.println("2)Edit contact");
		    int choice = sc.nextInt();
		    switch(choice) {
		    case 1:
		    	 contactInfo();
		    	 j++;
		    	 ContactList person4 = new ContactList(firstName,lastName,address,state,zip,phoneNumber,email);
		 		 personDetails[3]=person4;
		 		System.out.println("Newly updated contact list is");
				 for(int i = 0; i < 3 + j;i++) {
					   System.out.println(personDetails[i]);
				 }
		    	case 2:
		    		int i;
		    		System.out.println("Enter name of person you want to edit");
		    		String keyName = sc.next();
		    		for( i = 0; i < 3; i++) {
		    		if(keyName.equals(personDetails[i].firstName)) {
		    				contactInfo();
		    				ContactList person5 = new ContactList(firstName,lastName,address,state,zip,phoneNumber,email);
		    		 		personDetails[i]= person5;
		    			}
		    		}
		    		System.out.println("Newly edited contact list is");
		    		for(i = 0; i < 3;i++) {
		    			   System.out.println(personDetails[i]);
		    		}
		    		
			}
		}
		public static void contactInfo() {
			System.out.println("Enter details of person");
			System.out.println("Add first name");
			firstName = sc.next();
			System.out.println("Add last name");
			lastName= sc.next();
			System.out.println("Add address");
			address = sc.next();
			System.out.println("Add state");
			state= sc.next();
			System.out.println("Add zip");
			zip = sc.nextInt();
			System.out.println("Add phone number");
			phoneNumber = sc.nextLong();
			System.out.println("Add email");
			email = sc.next();
		}
	}