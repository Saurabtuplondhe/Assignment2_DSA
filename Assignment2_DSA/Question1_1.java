package Assignment2_DSA;

import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

import Assignment2_DSA.Question1;

public class Question1_1 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the total no of floors in the building");
		
		int noOfFloor = sc.nextInt();

	    int[] floors = new int[noOfFloor];
		
	   
		for(int i=0; i<noOfFloor; i++)  
		{  
		System.out.println("enter the floor size given on day : "+(i+1));
		floors[i] = sc.nextInt(); 
		}  
		System.out.println();
		
		Question1 service = new Question1();
		service.printConstructionTable(floors, noOfFloor);
	}
}
