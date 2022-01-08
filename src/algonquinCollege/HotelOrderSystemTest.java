package algonquinCollege;

import java.util.Scanner;

public class HotelOrderSystemTest {

	public static void main(String[] args) {
		// create Hotel object
		Hotel hotel = new Hotel();

		System.out.println("welcome to use hotel management system");
		
		System.out.println("enter 1 to check the room status");
		System.out.println("enter 2 to order the room");
		System.out.println("enter 3 to check out");
		System.out.println("enter 0 to quit the system");
		
		while(true) {
			// input the function number 
		Scanner scanner = new Scanner(System.in);
		System.out.println("please input the function number");
		int functionNo = scanner.nextInt();
		/**
		 * use this conditional statements to choose different method,
		 * if reception enter 1, call the print()
		 * if reception enter 2, call the method checkIn() and room object's isOcupied variable is changed to true;
		 * if reception enter 3, call the method checkOut() and room object's isOcupied variable is changed to false;
		 */
		if(functionNo==1) {
			hotel.print();
		} else if(functionNo==2) {
			System.out.println("please input the room number");
			int roomNo = scanner.nextInt();
			hotel.checkIn(roomNo);
			System.out.println(roomNo + "room has checked in");
		}
		else if(functionNo==3) {
			System.out.println("please input the room number");
			int roomNo = scanner.nextInt();
			hotel.checkOut(roomNo);
			System.out.println(roomNo + "room has checked out");
		} else if(functionNo==0) {
			System.out.println("Thank you for using this system");
		}
		else {
			System.out.println("sorry, you input the wrong number");
			return;
		}	
		}
		
		
		
	}

}
