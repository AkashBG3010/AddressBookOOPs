package com.bridgelabz;

public class PersonList {
	static ContactList [] personDetails = new ContactList[10];
	public static void main(String args[]) {
		ContactList person1 = new ContactList("Raj","Kumar","Nagar","MH",35,8620,"raj@gmail.com");
		ContactList person2 = new ContactList("Shashi","Rao","Chowk","TD",98,9736,"shashi@yahoo.com");
		ContactList person3 = new ContactList("Apurva","Mehta","Mahal","AP",47,7620,"amar@edu.com");
	    personDetails[0]=person1;
	    personDetails[1]=person2;
	    personDetails[2]=person3;
	    
	    System.out.println("Created contact list is");
	    for(int i = 0; i < 3;i++) {
		   System.out.println(personDetails[i]);
	    }
	}
}